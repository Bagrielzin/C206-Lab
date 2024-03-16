package org.example;

public class Motor {

    float velocidadeMaxima;

    public Motor(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void mostraInfo(){
        System.out.println("Velocidade max do motor: " + this.velocidadeMaxima);
    }

}
