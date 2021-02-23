package com.ufc.TecBetsCore.service;

import com.ufc.TecBetsCore.model.Aposta;

import java.util.List;

public interface ApostaService {
    List<Aposta> obterTodos();

    Aposta obterPorId(String id);

    Aposta criarAposta(Aposta aposta);

    Aposta removerPeloId(String id);
}
