package org.wa55death405.tp1.services;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.wa55death405.tp1.entities.Livre;
import org.wa55death405.tp1.repositories.LivreRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LivreServiceImpl implements ILivreService {

    private final LivreRepository livreRepository;

    @Override
    public List<Livre> getAll() {
        return livreRepository.findAll();
    }

    @Override
    public Livre getOne(Integer id) {
        return livreRepository.findById(id).orElseThrow(()->
                new EntityNotFoundException("Livre not found"));
    }

    @Override
    public Livre create(Livre livre) {
        return livreRepository.save(livre);
    }

    @Override
    public Livre update(Integer id, Livre livre) {
        if (livreRepository.existsById(id)) {
            livre.setCode(id);
            return livreRepository.save(livre);
        }
        return null;
    }

    @Override
    public Void delete(Integer id) {
        if (livreRepository.existsById(id)) {
            livreRepository.deleteById(id);
            return null;
        }
        return null;
    }
}
