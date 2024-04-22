package org.example;

public class Main {
    public static void main(String[] args) {

        Nave nave = new Nave();

        Impostor i = new Impostor("Schuller","vermelho","pinguim","Maya");
        Tripulante t1 = new Tripulante("Dudu","azul","palhaço","Chico");
        Tripulante t2 = new Tripulante("Matuí","roxo","monge","pardal");
        Tripulante t3 = new Tripulante("Abc","roxo");

        nave.addAstronauta(i);
        nave.addAstronauta(t1);
        nave.addAstronauta(t2);
        nave.addAstronauta(t3);

        nave.listarAstronautas();
    }
}