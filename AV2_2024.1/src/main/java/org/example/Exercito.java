package org.example;

public class Exercito {

    //Atributos do exército
    private String nome;
    Soldado[] soldados = new Soldado[10];

    //Constructor do exército
    public Exercito(String nome) {
        this.nome = nome;
    }

    //Método adiciona soldado
    public void addSoldado(Soldado s){
        for (int i = 0; i < soldados.length; i++) {
            if(soldados[i]==null){
                soldados[i] = s;
                break;
            }
        }
    }

    //Método mostrar informações
    public void mostraInfo(){
        System.out.println("Nome do exército: " + this.nome);
        System.out.println();
        for (int i = 0; i < soldados.length; i++) {
            if(soldados[i]!=null){
                if(soldados[i] instanceof Sargento){
                    Sargento sx = (Sargento) soldados[i];
                    sx.mostraInfo();
                    sx.usandoItem();
                    sx.defender();
                    System.out.println();
                }

                if(soldados[i] instanceof Oficial){
                    Oficial ox = (Oficial) soldados[i];
                    ox.mostraInfo();
                    ox.usandoItem();
                    ox.defender();
                    System.out.println();
                }

                if(soldados[i] instanceof MedicoMilitar){
                    MedicoMilitar mx = (MedicoMilitar) soldados[i];
                    mx.mostraInfo();
                    mx.usandoItem();
                    mx.curar();
                    System.out.println();
                }
            }
        }
        System.out.println("Número de soldados: " + Soldado.getQtdSoldado());
    }

}
