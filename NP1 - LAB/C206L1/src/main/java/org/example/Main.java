package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jogo[] jogos = new Jogo[10];
        Plataforma p1 = new Plataforma("From","Miyazaki");

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while(flag){
            System.out.println("--------------------------------");
            System.out.println("Menu de informações");
            System.out.println("1 - Adcionar jogo a plataforma");
            System.out.println("2 - Mostrar as informações dos jogos e plataforma");
            System.out.println("3 - Mostrar o jogo mais caro e barato");
            System.out.println("4 - Mostrar quantos jogos possuem dlc");
            System.out.println("5 - Sair");

            int op = sc.nextInt();
            switch (op){
                case 1:
                    sc.nextLine();
                    System.out.print("Entre com o nome do jogo: ");
                    String nomejogo = sc.nextLine();
                    System.out.print("Entre com o genero do jogo: ");
                    String generojogo = sc.nextLine();
                    System.out.print("Entre com o preco do jogo: ");
                    double precojogo = sc.nextDouble();
                    System.out.print("1 - jogo possui dlc, 2 - nao possui: ");
                    int dlcjogo = sc.nextInt();
                    boolean dlc;
                    if(dlcjogo == 1){
                        dlc = true;
                    }
                    else{
                        dlc = false;
                    }
                    Jogo jogo1 = new Jogo(nomejogo,generojogo,precojogo,dlc);
                    p1.adicionarJogo(jogo1);
                    break;

                case 2:
                    p1.mostraInfo();
                    break;

                case 3:
                    p1.mostraMaisCaroBarato();
                    break;

                case 4:
                    p1.calculaDlc();
                    break;

                case 5:
                    flag = false;
                    break;

            }
        }

        sc.close();
    }
}