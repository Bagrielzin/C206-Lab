package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Deck d1 = new Deck("Geraldo");
        Carta[] cartas = new Carta[10];

        Scanner input = new Scanner(System.in);

        boolean flag = true;
        while(flag){
            System.out.println("--------------------------------");
            System.out.println("Menu de informações");
            System.out.println("1 - Adcionar carta ao deck");
            System.out.println("2 - Mostrar as informações do deck e suas cartas");
            System.out.println("3 - Mostrar o poder total e a média");
            System.out.println("4 - Mostrar quantas cartas de cada tipo tem no deck");
            System.out.println("5 - Sair");

            int op = input.nextInt();
            switch (op){
                case 1:
                    input.nextLine();
                    System.out.print("Nome da carta: ");
                    String nomec = input.nextLine();
                    System.out.print("Poder da carta: ");
                    int poderc = input.nextInt();
                    input.nextLine();
                    System.out.print("Classificacao da carta: ");
                    String classc = input.nextLine();
                    Carta c1 = new Carta(nomec,poderc,classc);
                    d1.adicionarCarta(c1);
                    break;

                case 2:
                    d1.mostraInfo();
                    break;

                case 3:
                    d1.calculaPoderMedio();
                    break;

                case 4:
                    d1.calculaClassificacao();
                    break;

                case 5:
                    flag = false;
                    break;
            }
        }
        input.close();
    }
}