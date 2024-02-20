package org.wa55death405.tp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.wa55death405.tp1.entities.Etudiant;
import org.wa55death405.tp1.repositories.EtudiantRepository;
import org.wa55death405.tp1.repositories.LivreRepository;

import java.time.LocalDate;

@SpringBootApplication
public class Tp1Application implements CommandLineRunner {

	@Autowired
	private EtudiantRepository etudiantRepository;

	@Autowired
	private LivreRepository livreRepository;

    public static void main(String[] args) {

		SpringApplication.run(Tp1Application.class, args);
	}

	public void run(String... args) throws Exception {

		etudiantRepository.save(new Etudiant("etudiant1", "etudiant1", LocalDate.of(2000, 2, 12)));
		etudiantRepository.save(new Etudiant("etudiant2", "etudiant2", LocalDate.of(2001, 3, 10)));

		etudiantRepository.findAll().forEach(e -> {
			System.out.println(e.getNom());
		});

	}
}
