package org.wa55death405.tp1.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "livre_biblio")
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

    public Livre() {
    }

    public Livre(String ISBN, String titre, String auteur, LocalDate dateDePublication, Integer nombreDeCopies) {
        this.ISBN = ISBN;
        this.Titre = titre;
        this.Auteur = auteur;
        this.DateDePublication = dateDePublication;
        this.NombreDeCopies = nombreDeCopies;
    }


    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public String getAuteur() {
        return Auteur;
    }

    public void setAuteur(String auteur) {
        Auteur = auteur;
    }

    public LocalDate getDateDePublication() {
        return DateDePublication;
    }

    public void setDateDePublication(LocalDate dateDePublication) {
        DateDePublication = dateDePublication;
    }

    public Integer getNombreDeCopies() {
        return NombreDeCopies;
    }

    public void setNombreDeCopies(Integer nombreDeCopies) {
        NombreDeCopies = nombreDeCopies;
    }
}
