package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Locadora l1 = new Locadora("Catiau","1234578","BPRJ", 0);

        Carro[] carros = new Carro[10];

        boolean flag = true;
        while(flag){
            System.out.println("--------------------------------");
            System.out.println("Menu de informações");
            System.out.println("1 - Adicionar carro a locadora");
            System.out.println("2 - Mostrar as informações da locadora e dos carros");
            System.out.println("3 - Mostrar % dos carros disponiveis");
            System.out.println("4 - Alugar um carro");
            System.out.println("5 - Sair");

            int op = sc.nextInt();
            switch (op) {
                case 1:
                    sc.nextLine();
                    System.out.print("Modelo do carro: ");
                    String modeloc = sc.nextLine();
                    System.out.print("Cor do carro: ");
                    String corc = sc.nextLine();
                    System.out.print("true - alugado, false - nao alugado: ");
                    boolean alugc = sc.nextBoolean();
                    System.out.print("Velocidade máxima: ");
                    float velc = sc.nextFloat();
                    Carro carro1 = new Carro(modeloc,corc,alugc,velc);
                    l1.adicionarCarro(carro1);
                    break;

                case 2:
                    l1.mostraInfo();
                    break;

                case 3:
                    System.out.println(l1.contarCarrosParaAlugar() + "%");
                    break;

                case 4:
                    System.out.print("Escolha um carro pra alugar: ");
                    int index = sc.nextInt();
                    l1.alugarCarro(index);
                    break;

                case 5:
                    flag = false;
                    break;

            }
        }
    }
}