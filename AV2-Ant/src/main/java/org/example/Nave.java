package org.example;

public class Nave {

    Astronauta[] astronautas = new Astronauta[10];

    public void addAstronauta(Astronauta astronauta){
        for (int i = 0; i < astronautas.length; i++) {
            if(astronautas[i]==null){
                astronautas[i] = astronauta;
                break;
            }
        }
    }

    public void listarAstronautas(){
        for (int i = 0; i < astronautas.length; i++) {
            if(astronautas[i]!=null){
                if(astronautas[i] instanceof Tripulante){
                    Tripulante tx = (Tripulante) astronautas[i];
                    tx.fazerTask();
                    tx.fazerTask();
                    tx.fazerTask();
                    tx.mostraInfo();
                }

                if(astronautas[i] instanceof Impostor){
                    Impostor ix = (Impostor) astronautas[i];
                    ix.fazerTask();
                    ix.sabotarLuz();
                    ix.sabotarOxigenio();
                    ix.sabotarReator();
                    ix.executar();
                    ix.executar();
                    ix.mostraInfo();
                }
            }
        }
    }
}
