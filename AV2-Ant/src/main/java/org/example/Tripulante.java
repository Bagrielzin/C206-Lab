package org.example;

public class Tripulante extends Astronauta implements Task{

    private int numTask = 0;

    public Tripulante(String nome, String cor, String tiposkin, String tipopet) {
        super(nome, cor, tiposkin, tipopet);
    }

    public Tripulante(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Número de tasks feitas: " + this.numTask);
        System.out.println();
    }

    @Override
    public void reportar(){
        System.out.println("O tripulante reportou um corpo");
    }

    @Override
    public void votar(){
        System.out.println("Voto realizado");
    }

    public void fazerTask(){
        numTask += 1;
    }
}
