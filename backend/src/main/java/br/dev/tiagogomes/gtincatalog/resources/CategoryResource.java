package br.dev.tiagogomes.gtincatalog.resources;

import br.dev.tiagogomes.gtincatalog.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = new  ArrayList<>();
        list.add(new Category(UUID.randomUUID(), "Adulto"));
        list.add(new Category(UUID.randomUUID(), "Infantil"));
        return ResponseEntity.ok().body(list);
    }
}
