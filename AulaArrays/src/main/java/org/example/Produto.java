package org.example;

public class Produto {

    //atributos do produto
    String nome;
    int nota;
    Fabricante fabricante;
    int quantidade;

    //construtor produto
    public Produto(String nome, int nota, String nomeFab, int cnpj ,int quantidade) {
        this.nome = nome;
        this.nota = nota;
        this.fabricante = new Fabricante(nomeFab,cnpj);
        this.quantidade = quantidade;
    }

    public void mostraInfo(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Nota do produto: " + this.nota);
        System.out.println("Qtd do produto: " + this.quantidade);
        System.out.println("Nome do fabricante produto: " + this.fabricante.nome);
        System.out.println("cnpj do fabricante do produto: " + this.fabricante.cnpj);
    }
}
