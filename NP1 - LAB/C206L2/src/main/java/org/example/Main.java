package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Serie[] series = new Serie[10];
        Plataforma p1 = new Plataforma("Netflix");

        boolean flag = true;
        while(flag){
            System.out.println("--------------------------------");
            System.out.println("Menu de informações");
            System.out.println("1 - Adcionar série a plataforma");
            System.out.println("2 - Mostrar info");
            System.out.println("3 - Mostrar a série mais longa finalizada");
            System.out.println("4 - Mostrar porcentagem e média");
            System.out.println("5 - fim");
            int op = sc.nextInt();
            switch (op){
                case 1:
                    sc.nextLine();
                    System.out.print("Digite o nome da série: ");
                    String nomeSerie = sc.nextLine();
                    System.out.print("Digite a nota da série: ");
                    double notaSerie = sc.nextDouble();
                    System.out.print("Digite qtd de temporadas: ");
                    int qtdTemp = sc.nextInt();
                    System.out.print("1 - série finalizada, 2 - andamento: ");
                    int fin = sc.nextInt();
                    boolean finalizada;
                    if(fin == 1){
                        finalizada = true;
                    }
                    else{
                        finalizada = false;
                    }
                    sc.nextLine();
                    System.out.println("Nome do diretor: ");
                    String nomedir = sc.nextLine();
                    Serie s1 = new Serie(nomeSerie,notaSerie,qtdTemp,finalizada,nomedir);
                    p1.addSerie(s1);
                    break;

                case 2:
                    p1.mostraInfo();
                    break;

                case 3:
                    System.out.print("Serie mais longa finalizada: " + p1.serieMaisLongaFinalizada());
                    System.out.println();
                    break;

                case 4:
                    p1.mediaPorcentagem();
                    break;

                case 5:
                    flag = false;
                    break;
            }
        }

    }
}