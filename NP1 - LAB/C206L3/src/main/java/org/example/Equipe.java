package org.example;

public class Equipe {

    String capitao;
    Heroi[] herois = new Heroi[10];
    float maior = -9999f;
    int posMais;

    public Equipe(String capitao) {
        this.capitao = capitao;
    }

    public void adcionarHeroi(Heroi heroi){
        for(int i=0; i< herois.length; i++){
            if(herois[i] == null) {
                herois[i] = heroi;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome do capitao: " + this.capitao);
        for(int i=0; i< herois.length; i++){
            if(herois[i] != null) {
                System.out.println("Nome do heroi: " + herois[i].nome);
                System.out.println("Poder do heroi: " + herois[i].poder);
                if(herois[i].podeVoar){
                    System.out.println("Pode voar");
                }
                else{
                    System.out.println("Nao pode voar");
                }
                System.out.println();
            }
        }
    }

    public void mostraMaisForte(){
        for(int i=0; i< herois.length; i++){
            if(herois[i] != null) {
                if(herois[i].poder > maior){
                    maior = herois[i].poder;
                    posMais = i;
                }
            }
        }
        System.out.println("Herói mais forte: " + herois[posMais].nome);
    }

    public void calculaVoadores(){
        int qtdh = 0;
        int qtdv = 0;
        for(int i=0; i< herois.length; i++){
            if(herois[i] != null) {
                if(herois[i].podeVoar){
                    qtdv++;
                }
                qtdh++;
            }
        }

        System.out.println("Porcentagem de herois que voam: " + qtdv*100.0/qtdh + "%");
        System.out.println();
    }

}
