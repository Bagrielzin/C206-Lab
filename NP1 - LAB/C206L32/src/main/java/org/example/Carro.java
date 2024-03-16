package org.example;

public class Carro {

    String modelo;
    String cor;
    boolean alugado;
    Motor motor;

    public Carro(String modelo, String cor, boolean alugado, float velmax) {
        this.modelo = modelo;
        this.cor = cor;
        this.alugado = alugado;
        this.motor = new Motor(velmax);
    }

    public void mostraInfo(){
        System.out.println("Modelo do carro: " + this.modelo);
        System.out.println("Cor do carro: " + this.cor);
        if(this.alugado){
            System.out.println("Carro alugado");
        }
        else{
            System.out.println("Carro nao alugado");
        }
        System.out.println("Velocidade maxima: " + this.motor.velocidadeMaxima);
        System.out.println();
    }

}
