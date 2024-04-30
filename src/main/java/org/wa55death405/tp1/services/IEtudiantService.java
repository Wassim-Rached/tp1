package org.wa55death405.tp1.services;

import org.springframework.stereotype.Service;
import org.wa55death405.tp1.entities.Etudiant;

import java.util.List;

@Service
public interface IEtudiantService {
    public List<Etudiant> getAllEtudiant();
    public Etudiant findEtudiant(Integer id);
    public boolean saveEtudiant(Etudiant etudiant);
    public boolean deleteEtudiant(Integer id);
    public Etudiant updateEtudiant(Etudiant etudiant,Integer id);
}
