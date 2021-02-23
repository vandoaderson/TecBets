package com.ufc.TecBetsCore.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@Data
@Document
public class Usuario {

    public Usuario(String id, String nome, Integer idade, double saldo){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
    }
    @Id
    private String id;

    private String nome;
    private Integer idade;
    private double saldo;

}
