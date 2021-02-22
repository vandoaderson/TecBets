package com.ufc.TecBetsCore.business;

import com.ufc.TecBetsCore.model.Aposta;
import com.ufc.TecBetsCore.repository.ApostaRepository;
import com.ufc.TecBetsCore.service.ApostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApostaServiceBusiness implements ApostaService {

    @Autowired
    private ApostaRepository apostaRepository;

    @Override
    public List<Aposta> obterTodos() {
        return this.apostaRepository.findAll();
    }

    @Override
    public Aposta obterPorId(String id) {
        return this.apostaRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Aposta não existe."));
    }

    @Override
    public Aposta criar(Aposta aposta) {
        return this.apostaRepository.save(aposta);
    }

    @Override
    public Aposta removerPeloId(String id) {
        Aposta apostaDeletada = this.apostaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Aposta não existe."));
        this.apostaRepository.deleteById(id);
        return apostaDeletada;
    }
}
