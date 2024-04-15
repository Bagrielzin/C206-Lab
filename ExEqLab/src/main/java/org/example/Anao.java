package org.example;

public class Anao extends Habitante implements Mineracao{

    private float altura;
    private String reino;

    public Anao(int id, String nome, int idade, float energia, String nomeArma, boolean magicaArma, float altura, String reino) {
        super(id, nome, idade, energia, nomeArma, magicaArma);
        this.altura = altura;
        this.reino = reino;
    }

    @Override
    public void atacar(){
        if(arma.isMagica()){
            this.energia -= 20;
        }
        else{
            this.energia -= 10;
        }
        System.out.println("Anão atacou com " + this.arma.getNomeArma());
        if(this.arma.isMagica()){
            System.out.println("Arma mágica");
        }
        else{
            System.out.println("Arma normal");
        }
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Altura: " + this.altura);
        System.out.println("Reino: " + this.reino);
    }

    public void minerar(){
        System.out.println(this.nome + " está minerando");
    }
}
