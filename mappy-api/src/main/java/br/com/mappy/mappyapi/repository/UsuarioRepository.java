package br.com.mappy.mappyapi.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.mappy.mappyapi.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
        public Usuario findByUsername(String username);
}
