package com.ufc.TecBetsCore.model;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Data
@Document
public class Clube {

    public Clube(String id,String nome, int rank){
        this.id = id;
        this.nome = nome;
        this.rank = rank;
    }
    @Id
    private String id;

    private String nome;
    private int rank;
}
