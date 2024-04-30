package org.wa55death405.tp1.services;

import org.wa55death405.tp1.entities.Etudiant;
import org.wa55death405.tp1.repositories.EtudiantRepository;

import java.util.List;
import java.util.Optional;

public class IEtudiantServiceImpl implements IEtudiantService{
    EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant findEtudiant(Integer id) {
        Optional<Etudiant> etudiant = etudiantRepository.findById(id);
        return etudiant.orElse(null);
    }

    @Override
    public boolean saveEtudiant(Etudiant etudiant) {
        if (etudiantRepository.save(etudiant) != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteEtudiant(Integer id) {
        etudiantRepository.deleteById(id);
        return !etudiantRepository.existsById(id);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant, Integer id) {
        etudiant.setCode(id);
        etudiantRepository.save(etudiant);
        return etudiantRepository.findById(id).orElse(null);
    }
}
