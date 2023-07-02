package br.dev.tiagogomes.gtincatalog.repositories;

import br.dev.tiagogomes.gtincatalog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
