package org.example;

public class Aldeia {

    String nome;
    int qtdMoradores;
    String regiao;
    Ninja[] ninjas = new Ninja[10];

    public Aldeia(String nome, int qtdMoradores, String regiao) {
        this.nome = nome;
        this.qtdMoradores = qtdMoradores;
        this.regiao = regiao;
    }

    public void adicionarNinja(Ninja ninja){
        for (int i = 0; i < ninjas.length; i++) {
            if(ninjas[i] == null){
                ninjas[i] = ninja;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome da aldeia: " + this.nome);
        System.out.println("Quantidade de moradores: " + this.qtdMoradores);
        System.out.println("Regiao da aldeia: " + this.regiao);
        System.out.println();
        for (int i = 0; i < ninjas.length; i++) {
            if(ninjas[i] != null){
                ninjas[i].mostraInfo();
            }
        }
    }

    public void rankingS(){
        for (int i = 0; i < ninjas.length; i++) {
            if(ninjas[i] != null){
                if(ninjas[i].ranking.equals("S")){
                    System.out.println(ninjas[i].nome);
                }
            }
        }
    }

    public void qtdTitulos(){
        int gennin = 0;
        int chunnin = 0;
        int anbu = 0;

        for (int i = 0; i < ninjas.length; i++) {
            if(ninjas[i] != null){
                if(ninjas[i].titulo.equals("Gennin")){
                    gennin++;
                }
                else if(ninjas[i].titulo.equals("Chunnin")){
                    chunnin++;
                }
                else if(ninjas[i].titulo.equals("ANBU")){
                    anbu++;
                }
            }
        }
        System.out.println(gennin + " Gennins");
        System.out.println(chunnin + " Chunnins");
        System.out.println(anbu + " ANBUs");
    }

}
