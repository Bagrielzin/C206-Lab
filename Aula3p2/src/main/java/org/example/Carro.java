package org.example;

public class Carro {

    String nome;
    String cor;
    int ano;
    Motor motor = null;

    public Carro(String nome, String cor, int ano) {
        this.nome = nome;
        this.cor = cor;
        this.ano = ano;
        //this.motor = new Motor(cv);
    }
}
