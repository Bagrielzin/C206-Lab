package org.example;

public class Plataforma {

    String nome;
    String criador;
    Jogo[] jogos = new Jogo[10];
    int pc,pb;

    public Plataforma(String nome, String criador) {
        this.nome = nome;
        this.criador = criador;
    }

    public void mostraInfo(){
        System.out.println("Nome da plataforma: " + this.nome);
        System.out.println("Nome do criador: " + this.criador);
        for(int i=0; i< jogos.length; i++){
            if(jogos[i] != null) {
                jogos[i].mostraInfo();
                System.out.println();
            }
        }
    }

    public void adicionarJogo(Jogo jogo){
        for(int i=0; i< jogos.length; i++){
            if(jogos[i] == null){
                jogos[i] = jogo;
                break;
            }
        }
    }

    public void mostraMaisCaroBarato(){
        double caro = -9999;
        double barato = 9999;
        for(int i=0; i< jogos.length; i++){
            if(jogos[i] != null) {
                if (jogos[i].preco > caro) {
                    caro = jogos[i].preco;
                    pc = i;
                }

                if (jogos[i].preco < barato) {
                    barato = jogos[i].preco;
                    pb = i;
                }
            }
        }
        System.out.println("Jogo mais caro: " + jogos[pc].nome);
        System.out.println("Jogo mais barato: " + jogos[pb].nome);
    }

    public void calculaDlc(){
        int dlc = 0;
        for(int i=0; i< jogos.length; i++){
            if(jogos[i] != null) {
                if (jogos[i].dlc) {
                    dlc++;
                }
            }
        }
        System.out.println(dlc + " jogos possuem dlc");
    }


}
