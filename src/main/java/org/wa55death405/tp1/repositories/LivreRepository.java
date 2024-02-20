package org.wa55death405.tp1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wa55death405.tp1.entities.Livre;

public interface LivreRepository extends JpaRepository<Livre, Integer> {
}
