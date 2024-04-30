package org.wa55death405.tp1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EtatLivre {

    @Id
    @GeneratedValue
    private Integer Code;
    private Boolean Disponible;
    private Boolean Emprunte;
    @OneToMany(mappedBy = "etatLivre")
    private List<Livre> livres;
}
