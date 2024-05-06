package org.wa55death405.tp1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wa55death405.tp1.entities.Etudiant;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    List<Etudiant> findByNom(String nom);
}
