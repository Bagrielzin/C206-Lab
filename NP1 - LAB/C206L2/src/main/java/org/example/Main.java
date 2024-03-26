package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plataforma p1 = new Plataforma("Bagrielzinfix");
        Serie[] series = new Serie[10];

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
                    System.out.print("Nome da série: ");
                    String nomeSerie = sc.nextLine();
                    System.out.print("Nota da série: ");
                    double notaSerie = sc.nextDouble();
                    System.out.print("Número de temporadas: ");
                    int numtemp = sc.nextInt();
                    System.out.print("true - série finalizada, false - série em andamento: ");
                    boolean finalzd = sc.nextBoolean();
                    sc.nextLine();
                    System.out.print("Nome do diretor: ");
                    String nomedir = sc.nextLine();
                    Serie s1 = new Serie(nomeSerie,notaSerie,numtemp,finalzd,nomedir);
                    p1.addSerie(s1);
                    break;

                case 2:
                    p1.mostraInfo();
                    break;

                case 3:
                    System.out.println("Série mais lnga: " + p1.serieMaisLongaFinalizada());
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