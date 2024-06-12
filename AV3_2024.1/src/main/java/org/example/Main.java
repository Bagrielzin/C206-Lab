package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Instância do arquivo
        Arquivo a = new Arquivo();

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while(flag) {
            System.out.println("-----------------------------");
            System.out.println("Menu");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Listar por ordem crescente de média");
            System.out.println("4 - Quantidade de alunos por curso");
            System.out.println("5 - Sair");
            int op = sc.nextInt();

            switch (op) {
                //Cadastro de alunos
                case 1:
                    sc.nextLine();
                    try {
                        System.out.print("Nome: ");
                        String nomeAl = sc.nextLine();
                        System.out.print("Matricula: ");
                        int matAl = sc.nextInt();
                        //Exception da matricula invalida
                        if(matAl <= 0){
                            throw new InfoInvalidaException("Matrícula inválida");
                        }
                        sc.nextLine();
                        System.out.print("Curso: ");
                        String cursoAl = sc.nextLine();
                        //Exception do curso invalido
                        if(!cursoAl.equals("Computação") && !cursoAl.equals("Software") && !cursoAl.equals("Telecomunicações")){
                            throw new InfoInvalidaException("Curso inválido");
                        }
                        System.out.print("Média: ");
                        float mediaAl = sc.nextFloat();
                        System.out.println("Aluno cadastrado");
                        Aluno a1 = new Aluno(nomeAl,matAl,cursoAl,mediaAl);
                        a.escrever(a1);
                    }catch (InfoInvalidaException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    break;

                //Listando os alunos
                case 2:
                    ArrayList<Aluno> alunos = a.ler();
                    for (int i = 0; i < alunos.size(); i++) {
                        System.out.println("Nome: " + alunos.get(i).getNome());
                        System.out.println("Matricula: " + alunos.get(i).getMatricula());
                        System.out.println("Curso: " + alunos.get(i).getCurso());
                        System.out.println("Média: " + alunos.get(i).getMedia());
                        System.out.println();
                    }
                    break;

                //Listando em ordem crescente de matrícula
                case 3:
                    alunos = a.ler();
                    Collections.sort(alunos);
                    for (int i = 0; i < alunos.size(); i++) {
                        System.out.println("Nome: " + alunos.get(i).getNome());
                        System.out.println("Matricula: " + alunos.get(i).getMatricula());
                        System.out.println("Curso: " + alunos.get(i).getCurso());
                        System.out.println("Média: " + alunos.get(i).getMedia());
                        System.out.println();
                    }
                    break;

                //Quantidade de alunos por curso
                case 4:
                    alunos = a.ler();
                    int qtdComp = 0, qtdSoft = 0, qtdTel = 0;
                    for (int i = 0; i < alunos.size(); i++) {
                        if(alunos.get(i).getCurso().equals("Computação")){
                            qtdComp++;
                        }

                        else if(alunos.get(i).getCurso().equals("Software")){
                            qtdSoft++;
                        }

                        else if(alunos.get(i).getCurso().equals("Telecomunicações")){
                            qtdTel++;
                        }
                    }
                    System.out.println("Alunos de Computação: " + qtdComp);
                    System.out.println("Alunos de Software: " + qtdSoft);
                    System.out.println("Alunos de Telecomunicações: " + qtdTel);
                    break;

                //Fim do programa
                case 5:
                    flag = false;
                    break;
            }
        }
    }
}