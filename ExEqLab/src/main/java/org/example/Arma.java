package org.example;

public class Arma {

    //Atributos da arma
    private String nomeArma;
    private boolean magica;

    //Constructor da arma
    public Arma(String nomeArma, boolean magica) {
        this.nomeArma = nomeArma;
        this.magica = magica;
    }

    //Getters da arma
    public String getNomeArma() {
        return nomeArma;
    }

    public boolean isMagica() {
        return magica;
    }
}
