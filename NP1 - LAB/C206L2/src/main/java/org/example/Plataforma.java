package org.example;

public class Plataforma {

    String nome;
    Serie[] series = new Serie[10];

    public Plataforma(String nome) {
        this.nome = nome;
    }

    public void mostraInfo(){
        System.out.println("Nome da plataforma: " + this.nome);
        System.out.println();
        for (int i = 0; i < series.length; i++) {
            if(series[i]!=null)
                series[i].mostraInfo();
        }
    }

    public void addSerie(Serie serie){
        for (int i = 0; i < series.length; i++) {
            if(series[i]==null) {
                series[i] = serie;
                break;
            }
        }
    }

    public String serieMaisLongaFinalizada(){
        int maior = -99999;
        int posmaior = 0;
        for (int i = 0; i < series.length; i++) {
            if(series[i]!=null && series[i].finalizada){
                if(series[i].temporadas > maior){
                    maior = series[i].temporadas;
                    posmaior = i;
                }
            }
        }

        return this.series[posmaior].nome;
    }

    public void mediaPorcentagem(){
        double smais3 = 0;
        double qtdtt = 0;
        double notasmasi3 = 0;
        for (int i = 0; i < series.length; i++) {
            if(series[i]!=null){
                qtdtt++;
                if(series[i].temporadas >= 3){
                    smais3++;
                    notasmasi3 += series[i].nota;
                }
            }
        }

        System.out.println("Porcentagem de séries com mais de 3 temporadas: " + smais3*100.0/qtdtt + "%");
        System.out.println("Média das notas: " + notasmasi3/smais3);
    }
}
