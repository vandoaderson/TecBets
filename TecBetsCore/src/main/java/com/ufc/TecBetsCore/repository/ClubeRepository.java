package com.ufc.TecBetsCore.repository;

import com.ufc.TecBetsCore.model.Clube;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClubeRepository extends MongoRepository<Clube,String> {
}
