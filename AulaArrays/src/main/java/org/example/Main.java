package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[10];
        Empresa e1 = new Empresa("JFL");

        Scanner entrada = new Scanner(System.in);

        boolean flag = true;
        while(flag) {
            System.out.println("--------------------------------");
            System.out.println("Menu de informações");
            System.out.println("1 - Adcionar produto a empresa");
            System.out.println("2 - Mostrar as informações da empresa");
            System.out.println("3 - Sair do menu");

            int op = entrada.nextInt();
            entrada.nextLine();

            switch(op){
                case 1:
                    System.out.print("Entre com o nome do produto: ");
                    String nomeprod = entrada.nextLine();

                    System.out.print("Entre com a nota do produto: ");
                    int notaprod = entrada.nextInt();

                    System.out.print("Entre com a quantidade do produto: ");
                    int qtdproduto = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Entre com o nome do fabricante do produto: ");
                    String nomefabr = entrada.nextLine();

                    System.out.print("Entre com o cnpj do fabricante do produto: ");
                    int cnpjfabr = entrada.nextInt();

                    Produto p1 = new Produto(nomeprod,notaprod,nomefabr,cnpjfabr,qtdproduto);
                    e1.adicionaProd(p1);
                    break;

                case 2:
                    e1.mostraInfo();
                    break;

                case 3:
                    System.out.println("Fim do programa");
                    flag = false;
                    break;
            }
        }
    }
}