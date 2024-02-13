package br.com.pedro.memelandia.repositories;

import br.com.pedro.memelandia.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
}