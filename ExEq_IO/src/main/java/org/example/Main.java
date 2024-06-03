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
            System.out.println("3 - Ordenar por ordem alfabética");
            System.out.println("4 - Ordenar por ordem alfabética decrescente");
            System.out.println("5 - Sair");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    sc.nextLine();
                    System.out.println("Nome: ");
                    String nomeCliente = sc.nextLine();
                    System.out.println("Cpf: ");
                    String cpfCliente = sc.nextLine();
                    System.out.println("Endereço: ");
                    String enderecoCliente = sc.nextLine();
                    System.out.println("Idade: ");
                    int idadeCliente = sc.nextInt();
                    Cliente c1 = new Cliente(nomeCliente,cpfCliente,enderecoCliente,idadeCliente);
                    a.escrever(c1);
                    break;

                case 2:
                    ArrayList<Cliente> clientes = a.ler();
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println("Nome: " + clientes.get(i).getNome());
                        System.out.println("Cpf: " + clientes.get(i).getCpf());
                        System.out.println("Endereço: " + clientes.get(i).getEndereco());
                        System.out.println("Idade: " + clientes.get(i).getIdade());
                    }
                    break;

                case 3:
                    clientes = a.ler();
                    Collections.sort(clientes);
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println("Nome: " + clientes.get(i).getNome());
                        System.out.println("Cpf: " + clientes.get(i).getCpf());
                        System.out.println("Endereço: " + clientes.get(i).getEndereco());
                        System.out.println("Idade: " + clientes.get(i).getIdade());
                    }
                    break;

                case 4:
                    clientes = a.ler();
                    Collections.sort(clientes,Collections.reverseOrder());
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println("Nome: " + clientes.get(i).getNome());
                        System.out.println("Cpf: " + clientes.get(i).getCpf());
                        System.out.println("Endereço: " + clientes.get(i).getEndereco());
                        System.out.println("Idade: " + clientes.get(i).getIdade());
                    }
                    break;

                case 5:
                    flag = false;
                    break;
            }
        }
    }
}