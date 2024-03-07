package org.example;

public class Funcionario {

    String nome;
    int idade;
    double salario;

    public Funcionario(String nome, int idade, double salario) {
        System.out.println("Funcionario criado");
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public double calculaSalarioAnual(){
        double salaAnual = salario * 12;

        return salaAnual;
    }

    public double calculaDecimoTerceiro(){
        double salaAnual = salario * 13;

        return salaAnual;
    }

}
