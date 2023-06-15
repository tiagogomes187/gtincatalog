package br.dev.tiagogomes.gtincatalog.dto;

import br.dev.tiagogomes.gtincatalog.entities.Category;

import java.io.Serializable;
import java.util.UUID;

public class CategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID id;
    private String name;

    public CategoryDTO() {
    }

    public CategoryDTO(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDTO(Category entity){
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
