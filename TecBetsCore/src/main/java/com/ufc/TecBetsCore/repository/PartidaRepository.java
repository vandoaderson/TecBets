package com.ufc.TecBetsCore.repository;

import com.ufc.TecBetsCore.model.Partida;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartidaRepository extends MongoRepository <Partida, String> {
}
