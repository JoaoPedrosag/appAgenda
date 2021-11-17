package com.example.agenda.model;

import androidx.annotation.NonNull;

public class Aluno {
    private final String nome;
    private final String telefone;
    private final String email;
    private final String data;

    public Aluno(String nome, String telefone, String email, String data) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.data = data;
    }
    @NonNull
    @Override
    public String toString() {
        return nome;
    }
}
