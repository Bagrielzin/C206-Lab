package org.example;

public class Plataforma {

    String nome;
    int pmaisLonga;
    int maior = -9999;
    String maisLonga;
    Serie[] series = new Serie[10];

    public Plataforma(String nome) {
        this.nome = nome;
    }

    public void mostraInfo(){
        System.out.println("Nome da plataforma: " + this.nome);
        for(int i=0; i< series.length; i++){
            if(series[i]!=null){
                series[i].mostraInfo();
            }
        }
    }

    public void addSerie(Serie serie){
        for(int i=0; i<series.length; i++){
            if(series[i] == null){
                series[i] = serie;
                break;
            }
        }
    }

    String serieMaisLongaFinalizada(){
        for(int i=0; i<series.length; i++){
            if(series[i] != null){
                if(series[i].finalizada && series[i].temporadas > maior){
                    maior = series[i].temporadas;
                    pmaisLonga = i;
                }
            }
        }
        maisLonga = series[pmaisLonga].nome;
        return maisLonga;
    }

    void mediaPorcentagem(){
        double qtd = 0;
        double qtdt = 0;
        double porcent;
        double med;
        double somanotas = 0;
        for(int i=0; i<series.length; i++){
            if(series[i] != null){
                qtdt++;
                if(series[i].temporadas >= 3) {
                    qtd++;
                    somanotas += series[i].nota;
                }
            }
        }

        porcent = qtd/qtdt*100;
        med = somanotas/qtd;

        System.out.println("Porcentagem das 3 ou mais: " + porcent);
        System.out.println("Médiad aritmética 3 ou mais: " + med);

    }

}
