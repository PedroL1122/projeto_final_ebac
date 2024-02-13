package br.com.pedro.memelandia.repositories;

import br.com.pedro.memelandia.entities.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMeme extends JpaRepository<Meme, Long> {
}