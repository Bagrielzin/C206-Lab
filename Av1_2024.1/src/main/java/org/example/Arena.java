package org.example;

public class Arena {

    //Atributos da arena
    String nome;
    String lugar;
    Rapper[] rappers = new Rapper[10];

    //Constructor da arena
    public Arena(String nome, String lugar) {
        this.nome = nome;
        this.lugar = lugar;
    }

    //Funcao que adiciona rappers à arena
    public void addSerie(Rapper rapper){
        for (int i = 0; i < rappers.length; i++) {
            if(rappers[i]==null){
                rappers[i] = rapper;
                break;
            }
        }
    }

    //Função que mostra informações
    public void mostraInfo(){
        System.out.println("Nome da arena: " + this.nome);
        System.out.println("Lugar da arena: " + this.lugar);
        System.out.println();
        for (int i = 0; i < rappers.length; i++) {
            if(rappers[i]!=null){
                rappers[i].mostraInfo();
            }
        }
    }

    //Função que mostra os rappers com microfone dourado
    public void microfoneDou(){
        System.out.println("Rappers com micrfone dourado: ");
        for (int i = 0; i < rappers.length; i++) {
            if(rappers[i]!=null){
                if(rappers[i].microfone.material.equals("dourado")){
                    System.out.println(rappers[i].nome);
                }
            }
        }
    }

    //Função que mostra o primeiro e último lugar
    public void ranking(){
        //valores auxiliares da maior e menor nota
        float maior = -9999;
        float menor = 9999;
        //posicao do primeiro e último lugar no array
        int posMaior = 0;
        int posMenor = 0;

        for (int i = 0; i < rappers.length; i++) {
            if(rappers[i]!=null){
                if(rappers[i].nota > maior){
                    maior = rappers[i].nota;
                    posMaior = i;
                }

                if(rappers[i].nota < menor){
                    menor = rappers[i].nota;
                    posMenor = i;
                }
            }
        }

        System.out.println("Ganhador da batalha: " + rappers[posMaior].nome);
        System.out.println("Último lugar da batalha: " + rappers[posMenor].nome);
    }


}
