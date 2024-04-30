package org.wa55death405.tp1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue
    private Integer code;

    private String nom;

    private String prenom;

    @Temporal(TemporalType.DATE)
    private LocalDate dateNaissance;

    @OneToOne
    @JoinColumn(name = "idAdresse")
    private Adresse adresse;

    @ManyToMany
    @JoinTable(name = "emprunt",
            joinColumns = @JoinColumn(name = "etudiant_id"),
            inverseJoinColumns = @JoinColumn(name = "livre_id"))
    private List<Livre> livres;
}
