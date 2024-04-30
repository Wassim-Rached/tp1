package org.wa55death405.tp1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "livre_biblio")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Livre {
    @Id
    @GeneratedValue
    private Integer Code;
    private String ISBN;
    @Column(name = "titre_livre", length = 40)
    private String Titre;
    @Column(name = "auteur_livre")
    private String Auteur;
    @Column(name = "date_publication")
    @Temporal(TemporalType.DATE)
    private LocalDate DateDePublication;
    @Column(name = "nb_copies")
    private Integer NombreDeCopies;

    @ManyToOne
    @JoinColumn(name = "idEtat")
    private EtatLivre etatLivre;
}
