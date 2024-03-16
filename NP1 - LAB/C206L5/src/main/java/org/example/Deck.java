package org.example;

import com.sun.security.jgss.GSSUtil;

public class Deck {

    String dono;
    Carta[] cartas = new Carta[10];

    public Deck(String dono) {
        this.dono = dono;
    }

    public void adicionarCarta(Carta carta){
        for (int i = 0; i < cartas.length; i++) {
            if(cartas[i] == null){
                cartas[i] = carta;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Dono do deck: " + this.dono);
        System.out.println();
        for (int i = 0; i < cartas.length; i++) {
            if(cartas[i] != null){
                System.out.println("Nome da carta: " + cartas[i].nome);
                System.out.println("Poder da carta: " + cartas[i].poder);
                System.out.println("Classificacao: " + cartas[i].classificacao);
                System.out.println();
            }
        }
    }

    public void calculaPoderMedio(){
        int qtd = 0;
        double somapoder = 0;
        for (int i = 0; i < cartas.length; i++) {
            if(cartas[i] != null){
                qtd++;
                somapoder += cartas[i].poder;
            }
        }
        System.out.println("Poder total: " + somapoder);
        System.out.println("Média dos poderes: " + somapoder/qtd);
    }

    public void calculaClassificacao(){
        int sold = 0;
        int arq = 0;
        int pes = 0;
        for (int i = 0; i < cartas.length; i++) {
            if(cartas[i] != null){
                if (cartas[i].classificacao.equals("soldado")){
                    sold++;
                }
                else if (cartas[i].classificacao.equals("arqueiro")){
                    arq++;
                }
                else if (cartas[i].classificacao.equals("pesado")){
                    pes++;
                }
            }
        }
        System.out.println(sold + " soldado(s)");
        System.out.println(arq + " arqueiro(s)");
        System.out.println(pes + " pesado(s)");

    }

}
