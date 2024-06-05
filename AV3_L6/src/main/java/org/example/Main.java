package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Arquivo a = new Arquivo();

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while(flag) {
            System.out.println("-----------------------------");
            System.out.println("Menu");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Ordenar por ordem crescente de preço");
            System.out.println("4 - Quantidade de cada produto");
            System.out.println("5 - Sair");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nomeProd = sc.nextLine();
                    System.out.print("Preco: ");
                    double precoProd = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Tipo: ");
                    String tipoProd = sc.nextLine();
                    Produto p1 = new Produto(nomeProd,precoProd,tipoProd);
                    a.escrever(p1);
                    break;

                case 2:
                    ArrayList<Produto> produtos = a.ler();
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("Nome: " + produtos.get(i).getNome());
                        System.out.println("Preço: " + produtos.get(i).getPreco());
                        System.out.println("Tipo: " + produtos.get(i).getTipo());
                        System.out.println();
                    }
                    break;

                case 3:
                    produtos = a.ler();
                    Collections.sort(produtos);
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("Nome: " + produtos.get(i).getNome());
                        System.out.println("Preço: " + produtos.get(i).getPreco());
                        System.out.println("Tipo: " + produtos.get(i).getTipo());
                        System.out.println();
                    }
                    break;

                case 4:
                    produtos = a.ler();
                    int qtdCmd = 0, qtdHig = 0, qtdDec = 0;
                    for (int i = 0; i < produtos.size(); i++) {
                        if(produtos.get(i).getTipo().equals("Comida")){
                            qtdCmd++;
                        }

                        else if(produtos.get(i).getTipo().equals("Higiene")){
                            qtdHig++;
                        }

                        else if(produtos.get(i).getTipo().equals("Decoração")){
                            qtdDec++;
                        }
                    }
                    System.out.println("Comida: " + qtdCmd);
                    System.out.println("Higiene: " + qtdHig);
                    System.out.println("Decoração: " + qtdDec);
                    break;

                case 5:
                    flag = false;
                    break;
            }
        }
    }
}