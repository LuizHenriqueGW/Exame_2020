package com.example.exame_2020;

import java.io.Serializable;

public class Cachorro implements Serializable {
    private String Nome;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
