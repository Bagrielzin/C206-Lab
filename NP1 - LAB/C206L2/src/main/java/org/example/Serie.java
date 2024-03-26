package org.example;

public class Serie {

    String nome;
    double nota;
    int temporadas;
    boolean finalizada;
    Diretor diretor;

    public Serie(String nome, double nota, int temporadas, boolean finalizada, String nomediretor) {
        this.nome = nome;
        this.nota = nota;
        this.temporadas = temporadas;
        this.finalizada = finalizada;
        this.diretor = new Diretor(nomediretor);
    }

    public void mostraInfo(){
        System.out.println("Nome da série: " + this.nome);
        System.out.println("Nota da série: " + this.nota);
        System.out.println("Número de temporadas: " + this.temporadas);
        if(this.finalizada)
            System.out.println("Série finalizada");
        else
            System.out.println("Série não finalizada");
        System.out.println("Nome do diretor da série: " + this.diretor.nome);
        System.out.println();
    }
}
