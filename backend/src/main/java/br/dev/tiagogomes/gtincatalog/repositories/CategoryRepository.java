package br.dev.tiagogomes.gtincatalog.repositories;

import br.dev.tiagogomes.gtincatalog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
