package org.example;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro("ferrari","azul",2020);

        Motor m1 = new Motor(80);

        System.out.println("Nome do carro: " + c1.nome);
        System.out.println("Cor do carro: " + c1.cor);
        System.out.println("Ano do carro: " + c1.ano);
        c1.motor = m1;
        System.out.println("Motor: " + c1.motor.cv);
    }

}