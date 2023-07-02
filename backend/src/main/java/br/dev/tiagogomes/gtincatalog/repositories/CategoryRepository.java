package br.dev.tiagogomes.gtincatalog.repositories;

import br.dev.tiagogomes.gtincatalog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
