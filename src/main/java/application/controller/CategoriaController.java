package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.Categoria;
import application.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    CategoriaRepository categoriaRepository;

    public Iterable<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Categoria insert(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
