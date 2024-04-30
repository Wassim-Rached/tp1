package org.wa55death405.tp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.wa55death405.tp1.entities.Adresse;
import org.wa55death405.tp1.entities.EtatLivre;
import org.wa55death405.tp1.entities.Etudiant;
import org.wa55death405.tp1.entities.Livre;
import org.wa55death405.tp1.repositories.AdresseRepository;
import org.wa55death405.tp1.repositories.EtudiantRepository;
import org.wa55death405.tp1.repositories.LivreRepository;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class Tp1Application implements CommandLineRunner {

	@Autowired
	private EtudiantRepository etudiantRepository;

	@Autowired
	private LivreRepository livreRepository;

	@Autowired
	private AdresseRepository adresseRepository;

    public static void main(String[] args) {

		SpringApplication.run(Tp1Application.class, args);
	}

	public void run(String... args) throws Exception {
		Adresse adresse1 = Adresse
				.builder()
				.NumAppart(12)
				.Rue("Rue de la paix")
				.Ville("Paris")
				.CodePostal("7500")
				.build();

		Adresse adresse2 = Adresse
				.builder()
				.NumAppart(13)
				.Rue("Rue de la guerre")
				.Ville("Lyon")
				.CodePostal("6900")
				.build();

		adresseRepository.save(adresse1);
		adresseRepository.save(adresse2);

		Etudiant etudiant1 = Etudiant
				.builder()
				.nom("Dupont")
				.prenom("Jean")
				.dateNaissance(LocalDate.of(1990, 1, 1))
				.adresse(adresse1)
				.build();

		Etudiant etudiant2 = Etudiant
				.builder()
				.nom("Aubert")
				.prenom("Marie")
				.dateNaissance(LocalDate.of(1995, 2, 2))
				.adresse(adresse2)
				.build();

		etudiant1 = etudiantRepository.save(etudiant1);
		etudiant2 =  etudiantRepository.save(etudiant2);

		etudiantRepository.findAll().forEach(System.out::println);

		EtatLivre etatLivre1 = EtatLivre
				.builder()
				.Disponible(true)
				.Emprunte(true)
				.build();


		EtatLivre etatLivre2 = EtatLivre
				.builder()
				.Disponible(true)
				.Emprunte(false)
				.build();

		Livre livre1 = Livre
				.builder()
				.Titre("Livre1")
				.Auteur("Auteur1")
				.DateDePublication(LocalDate.of(2000, 1, 1))
				.NombreDeCopies(2)
				.etatLivre(etatLivre1)
				.build();

		Livre livre2 = Livre
				.builder()
				.Titre("Livre2")
				.Auteur("Auteur2")
				.DateDePublication(LocalDate.of(2005, 2, 2))
				.NombreDeCopies(3)
				.etatLivre(etatLivre1)
				.build();

		Livre livre3 = Livre
				.builder()
				.Titre("Livre3")
				.Auteur("Auteur3")
				.DateDePublication(LocalDate.of(2010, 3, 3))
				.NombreDeCopies(4)
				.etatLivre(etatLivre2)
				.build();


		livre1 =  livreRepository.save(livre1);
		livre2 = livreRepository.save(livre2);
		livre3 = livreRepository.save(livre3);

		livreRepository.findAll().forEach(System.out::println);

		etudiant1.setLivres(List.of(livre1, livre3));

		System.out.println(etudiant1.getLivres());



	}


}
