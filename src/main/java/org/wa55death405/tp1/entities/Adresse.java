package org.wa55death405.tp1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Adresse {
    @Id
    @GeneratedValue
    private Integer Code;
    private Integer NumAppart;
    @Column(length = 50)
    private String Rue;
    @Column(length = 30)
    private String Ville;
    @Column(length = 4)
    private String CodePostal;

    @OneToOne(mappedBy = "adresse")
    private Etudiant etudiant;

}
