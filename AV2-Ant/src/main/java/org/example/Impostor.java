package org.example;

public class Impostor extends Astronauta implements Executar,Task{

    private int numMortes = 0;

    public Impostor(String nome, String cor, String tiposkin, String tipopet) {
        super(nome, cor, tiposkin, tipopet);
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Número de mortes: " + this.numMortes);
        System.out.println();
    }

    @Override
    public void reportar(){
        System.out.println("O impostor fez um kill report");
    }

    @Override
    public void votar(){
        System.out.println("Voto realizado");
    }

    public void sabotarReator(){
        System.out.println("O impostor sabotou o reator");
    }

    public void sabotarOxigenio(){
        System.out.println("O impostor sabotou o oxigênio");
    }

    public void sabotarLuz(){
        System.out.println("O impostor sabotou a luz");
    }

    public void executar(){
        this.numMortes += 1;
    }

    public void fazerTask(){
        System.out.println("Fez uma fake task");
    }
}
