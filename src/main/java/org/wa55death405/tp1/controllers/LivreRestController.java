package org.wa55death405.tp1.controllers;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.wa55death405.tp1.entities.Livre;
import org.wa55death405.tp1.services.ILivreService;

import java.util.List;

@RestController
@RequestMapping("/api/livres")
@RequiredArgsConstructor
public class LivreRestController {

    private final ILivreService livreService;


    // crud for livre
    @GetMapping
    public ResponseEntity<List<Livre>> getAll() {
        return new ResponseEntity<>(livreService.getAll(), null, 200);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livre> getOne(@PathVariable Integer id) {
        return new ResponseEntity<>(livreService.getOne(id), null, 200);
    }

    @PostMapping
    public ResponseEntity<Livre> create(@RequestBody Livre livre) {
        return new ResponseEntity<>(livreService.create(livre), null, 201);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livre> update(@PathVariable Integer id, @RequestBody Livre livre) {
        return new ResponseEntity<>(livreService.update(id, livre), null, 204);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        livreService.delete(id);
        return ResponseEntity.notFound().build();
    }
}
