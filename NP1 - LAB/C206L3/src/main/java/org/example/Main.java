package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Heroi[] herois = new Heroi[10];
        Equipe e1 = new Equipe("Goku");

        boolean flag = true;
        while(flag){
            System.out.println("--------------------------------");
            System.out.println("Menu de informações");
            System.out.println("1 - Adcionar heroi");
            System.out.println("2 - Mostrar as informações da equipe e dos heoris");
            System.out.println("3 - Mostrar heroi mais forte");
            System.out.println("4 - Porcentagem dos herois que voam");
            System.out.println("5 - Sair");

            int op = input.nextInt();
            switch(op){
                case 1:
                    input.nextLine();
                    System.out.print("Nome do heroi: ");
                    String nomeheroi = input.nextLine();
                    System.out.print("Poder do heroi: ");
                    float poderheroi = input.nextFloat();
                    System.out.print("1 - pode voar, 2 - nao pode: ");
                    int pode = input.nextInt();
                    boolean voar;
                    if(pode == 1){
                        voar = true;
                    }
                    else
                        voar = false;
                    Heroi h1 = new Heroi(nomeheroi,poderheroi,voar);
                    e1.adcionarHeroi(h1);
                    break;

                case 2:
                    e1.mostraInfo();
                    break;

                case 3:
                    e1.mostraMaisForte();
                    break;

                case 4:
                    e1.calculaVoadores();
                    break;

                case 5:
                    flag = false;
                    break;
            }
        }

    }
}