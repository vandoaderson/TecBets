package com.ufc.TecBetsCore.service;

import com.ufc.TecBetsCore.model.Partida;

import java.util.List;

public interface PartidaService {

    List<Partida> obterTodos();

    Partida obterPorId(String id);

    Partida criarPartida(Partida partida);

    Partida removerPeloId(String id);
}
