package com.ufc.TecBetsCore.service;

import com.ufc.TecBetsCore.model.Clube;

import java.util.List;

public interface ClubeService {
    List<Clube> obterTodos();

    Clube obterPorId(String id);

    Clube criar(Clube clube);

    Clube removerPeloId(String id);
}
