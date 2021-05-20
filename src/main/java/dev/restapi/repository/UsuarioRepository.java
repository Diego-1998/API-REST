package dev.restapi.repository;

import dev.restapi.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {

}
