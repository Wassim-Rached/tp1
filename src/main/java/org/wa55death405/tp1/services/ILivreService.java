package org.wa55death405.tp1.services;

import org.wa55death405.tp1.entities.Livre;

import java.util.List;

public interface ILivreService {
    List<Livre> getAll();
    Livre getOne(Integer id);
    Livre create(Livre livre);
    Livre update(Integer id, Livre livre);
    Void delete(Integer id);
}
