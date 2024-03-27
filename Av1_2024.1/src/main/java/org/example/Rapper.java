package org.example;

public class Rapper {

    //Atributos do rapper
    String nome;
    float nota;
    int idade;
    Microfone microfone;

    //Constructor do rapper
    public Rapper(String nome, float nota, int idade, String material) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
        this.microfone = new Microfone(material);
    }

    //Função que mostras as informações do rapper
    public void mostraInfo(){
        System.out.println("Nome do rapper: " + this.nome);
        System.out.println("Nota do rapper: " + this.nota);
        System.out.println("Idade do rapper: " + this.idade);
        System.out.println("Material do microfone: " + this.microfone.material);
        System.out.println();
    }

}
