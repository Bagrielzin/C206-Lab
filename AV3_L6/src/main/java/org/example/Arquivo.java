package org.example;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Métodos que podemos realizar com o arquivo
    /*1*/public void escrever(Produto p) {
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os = null; // fluxo de entrada
        OutputStreamWriter osw = null; //leitor de fluxo de entrada
        BufferedWriter bw = null; //buffer entrada

        // Variável auxiliar
        String linha;

        try {
            // Abrindo a saída de dados
            /*1*/os = new FileOutputStream("Produto.txt", true); // Nome do arquivo onde será salvo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);


            // Flag que indica onde começa as informações do Jogo
            /*2*/bw.write("++ Produto ++\n");
            bw.write(p.getNome() + "\n");
            bw.write(p.getPreco() + "\n");
            bw.write(p.getTipo() + "\n");

        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        } finally {
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (Exception e) {
            }
        }
    }

    // 2. Método ler
    /*3*/public ArrayList<Produto> ler() {

        // ArrayList auxiliar para salvar funcionários encontrados no arquivo
        /*4*/ArrayList<Produto> encontreiNoArquivo = new ArrayList<>();

        // Classes que permitem leitura de dados do arquivo
        InputStream is = null; //fluxo saida
        InputStreamReader isr = null; //gerador de fluxo de saida
        BufferedReader br = null; // buffer de saida

        // Variável auxiliar que servirá de flag para o while
        String linhaLer;

        try {
            // Instanciando os objetos
            /*5*/is = new FileInputStream("Produto.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer = br.readLine();

            while (linhaLer != null) {
                // Comparando se o que está em linhaLer é igual a minha flag
                /*6*/if (linhaLer.contains("++ Produto ++")) {
                    // Variável auxiliar de funcionario
                    Produto p1 = new Produto();
                    p1.setNome(br.readLine());
                    p1.setPreco(Double.parseDouble(br.readLine()));
                    p1.setTipo(br.readLine());

                    // Adicionando o funcionario no array
                    /*7*/encontreiNoArquivo.add(p1);
                }
                linhaLer = br.readLine();
            }


        } catch (Exception e) {
        } finally {
            try {
                br.close();
            } catch (Exception e) {

            }
        }


        return encontreiNoArquivo;


    }
}
