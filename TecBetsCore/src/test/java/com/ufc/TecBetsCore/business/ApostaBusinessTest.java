package com.ufc.TecBetsCore.business;


import com.ufc.TecBetsCore.model.Aposta;
import com.ufc.TecBetsCore.repository.ApostaRepository;
import com.ufc.TecBetsCore.service.ApostaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ApostaBusinessTest {
    @Autowired
    private ApostaService apostaService;

    @MockBean
    private ApostaRepository apostaRepository;

    @Test
    void obtemTodosTest(){
        when(apostaRepository.findAll()).thenReturn(Stream
                .of(new Aposta("123456","123456","123456","123456",1000),new Aposta("654321","654321","654321","654321",2000))
                .collect(Collectors.toList()));
        assertEquals(2, apostaService.obterTodos().size());
    }

    @Test
    void obtemPorIdTest() {
        String id = "123456";
        when(apostaRepository.findById(id)).thenReturn(java.util.Optional.of(new Aposta("123456","123456","123456","123456",1000)));
        assertEquals(id, apostaService.obterPorId(id).getId());
    }

    @Test
    void removePeloIdTest() {
        Aposta aposta = new Aposta("123456","123456","123456","123456",1000);
        apostaService.removerPeloId("123456");
        verify(apostaRepository,times(1)).delete(aposta);
    }

    @Test
    void criarApostaTest() {
        Aposta aposta = new Aposta("123456","123456","123456","123456",1000);
        when(apostaRepository.save(aposta)).thenReturn(aposta);
        Assertions.assertEquals(aposta, apostaService.criarAposta(aposta));
    }
}
