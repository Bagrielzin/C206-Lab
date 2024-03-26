package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ninja[] ninjas = new Ninja[10];

        Aldeia a1 = new Aldeia("Konoha",0,"Fogo");

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while(flag){
            System.out.println("--------------------------------");
            System.out.println("Menu de informações");
            System.out.println("1 - Adcionar ninja a aldeia");
            System.out.println("2 - Mostrar as informações da aldeia e dos ninjas");
            System.out.println("3 - Mostrar os ninjas rank S");
            System.out.println("4 - Mostrar quantos ninjas por titulo");
            System.out.println("5 - Sair");

            int op = sc.nextInt();
            switch (op){
                case 1:
                    sc.nextLine();
                    System.out.print("Nome do ninja: ");
                    String nomeNinja = sc.nextLine();
                    System.out.print("Idade do ninja: ");
                    int idadeNinja = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Titulo do ninja: ");
                    String tituloNinja = sc.nextLine();
                    System.out.print("Ranking do ninja: ");
                    String rankNinja = sc.nextLine();
                    Ninja ninja1 = new Ninja(nomeNinja,idadeNinja,tituloNinja,rankNinja);
                    a1.adicionarNinja(ninja1);
                    break;

                case 2:
                    a1.mostraInfo();
                    break;

                case 3:
                    a1.rankingS();
                    break;

                case 4:
                    a1.qtdTitulos();
                    break;

                case 5:
                    flag = false;
                    break;
            }
        }

    }
}