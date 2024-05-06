package org.wa55death405.tp1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("etudiantsByLastName/{lastName}")
    public List<Etudiant> getOneParam(@PathVariable String lastName){
        return iEtudiantService.findEtudiantByNom(lastName);
    }

    @PostMapping("etudiants")
    public boolean addEtudiant(@RequestBody Etudiant etudiant){
        return iEtudiantService.saveEtudiant(etudiant);
    }

    @PutMapping("etudiants/{id}")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant,@PathVariable Integer id){
        return iEtudiantService.updateEtudiant(etudiant,id);
    }

    @DeleteMapping("etudiants/{id}")
    public boolean deleteEtudiant(@PathVariable Integer id){
        return iEtudiantService.deleteEtudiant(id);
    }


}
