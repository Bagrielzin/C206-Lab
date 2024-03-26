package org.example;

public class Ninja {

    String nome;
    int idade;
    String titulo;
    String ranking;

    public Ninja(String nome, int idade, String titulo, String ranking) {
        this.nome = nome;
        this.idade = idade;
        this.titulo = titulo;
        this.ranking = ranking;
    }

    public void mostraInfo(){
        System.out.println("Nome do ninja: " + this.nome);
        System.out.println("Idade do ninja: " + this.idade);
        System.out.println("Titulo do ninja: " + this.titulo);
        System.out.println("Ranking do ninja: " + this.ranking);
        System.out.println();
    }
}
