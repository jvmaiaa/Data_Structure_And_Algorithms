package org.example.lambdas.m3.ex008;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {
    }

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
