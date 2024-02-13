package br.com.pedro.memelandia.repositories;

import br.com.pedro.memelandia.entities.CategoriaMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCategoriaMeme extends JpaRepository<CategoriaMeme, Long> {
}
