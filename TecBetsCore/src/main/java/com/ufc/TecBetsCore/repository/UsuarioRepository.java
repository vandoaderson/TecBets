package com.ufc.TecBetsCore.repository;

import com.ufc.TecBetsCore.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository <Usuario, String> {
}
