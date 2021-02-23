package com.ufc.TecBetsCore.repository;

import com.ufc.TecBetsCore.model.Aposta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApostaRepository extends MongoRepository<Aposta, String> {
}
