package com.ufc.TecBetsCore.business;

import com.ufc.TecBetsCore.model.Clube;
import com.ufc.TecBetsCore.repository.ClubeRepository;
import com.ufc.TecBetsCore.service.ClubeService;
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
public class ClubeBusinessTest {

    @Autowired
    private ClubeService clubeService;

    @MockBean
    private ClubeRepository clubeRepository;

    @Test
    void obtemTodosTest(){
        when(clubeRepository.findAll()).thenReturn(Stream
                .of(new Clube("123456","ClubeTeste",1),new Clube("654321","ClubeTeste2",2))
                .collect(Collectors.toList()));
        assertEquals(2, clubeService.obterTodos().size());
    }

    @Test
    void obtemPorIdTest() {
        String id = "123456";
        when(clubeRepository.findById(id)).thenReturn(java.util.Optional.of(new Clube("123456","ClubeTeste",1)));
        assertEquals(id, clubeService.obterPorId(id).getId());
    }

    @Test
    void removePeloIdTest() {
        Clube clube = new Clube("123456","ClubeTeste",1);
        clubeService.removerPeloId("123456");
        verify(clubeRepository,times(1)).delete(clube);
    }

    @Test
    void criarClubeTest() {
        Clube clube = new Clube("123456","ClubeTeste",1);
        when(clubeRepository.save(clube)).thenReturn(clube);
        Assertions.assertEquals(clube, clubeService.criarClube(clube));
    }
}
