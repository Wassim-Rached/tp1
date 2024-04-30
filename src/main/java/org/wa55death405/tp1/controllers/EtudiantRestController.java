package org.wa55death405.tp1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wa55death405.tp1.entities.Etudiant;
import org.wa55death405.tp1.services.IEtudiantService;

import java.util.List;

@RestController
public class EtudiantRestController {
    @Autowired
    IEtudiantService iEtudiantService;

    @GetMapping("etudiants")
    public List<Etudiant> getAll(){
        return iEtudiantService.getAllEtudiant();
    }

    @GetMapping("etudiants/{id}")
    public Etudiant getOne(@PathVariable Integer id){
        return iEtudiantService.findEtudiant(id);
    }

    @GetMapping("etudiantsByLastNa")

}
