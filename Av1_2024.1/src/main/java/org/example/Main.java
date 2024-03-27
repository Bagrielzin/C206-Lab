package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arena arena = new Arena("Inatel","Santa Rita"); //Inicializando arena com suas infos
        Rapper[] rappers = new Rapper[10]; // Array dos rappers

        boolean flag = true;
        while(flag){
            System.out.println("--------------------------------");
            System.out.println("Menu de informações");
            System.out.println("1 - Adcionar rapper à arena");
            System.out.println("2 - Mostrar info do rapper e da arena");
            System.out.println("3 - Mostrar quais rappers tem microfone dourado");
            System.out.println("4 - Mostrar vencedores e perdedores da batalha");
            System.out.println("5 - fim");
            int op = sc.nextInt();

            switch (op){
                //a) Adcionar rappers à arena
                case 1:
                    sc.nextLine();
                    System.out.print("Nome do rapper: ");
                    String nomeRapper = sc.nextLine();
                    System.out.print("Nota do rapper (0-10): ");
                    float notaRapper = sc.nextFloat();
                    System.out.print("Idade do rapper: ");
                    int idadeRapper = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Material do microfone (dourado,madeira,plastico): ");
                    String materialMicro = sc.nextLine();
                    //Armazenando as informações em r1 e enviando elas através da função
                    Rapper r1 = new Rapper(nomeRapper,notaRapper,idadeRapper,materialMicro);
                    arena.addSerie(r1);
                    break;

                //b) Mostra informações da arena e dos rappers
                case 2:
                    arena.mostraInfo();
                    break;

                //c) Mostra rappers com microfone dourado
                case 3:
                    arena.microfoneDou();
                    break;

                //d) Mostra os vencedores e perdedores
                case 4:
                    arena.ranking();
                    break;

                //Fim do programa
                case 5:
                    System.out.println("Fim do programa");
                    flag = false;
                    break;
            }
        }

        //Fechamento do scanner
        sc.close();
    }
}