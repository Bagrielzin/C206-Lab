package org.example;

public class Elfo extends Habitante implements Cura{

    //Atributo do elfo
    String tribo;

    //Atributos herdados da super classe
    public Elfo(int id, String nome, int idade, float energia, String nomeArma, boolean magicaArma, String tribo) {
        super(id, nome, idade, energia, nomeArma, magicaArma);
        this.tribo = tribo;
    }

    //Método de viajar do elfo
    public void viajar(){
        System.out.println(this.nome + " está viajando");
    }

    //Método de atacar do elfo
    @Override
    public void atacar(){
        if(arma.isMagica()){
            this.energia -= 20;
        }
        else{
            this.energia -= 10;
        }
        System.out.println("Elfo atacou com " + this.arma.getNomeArma());
        if(this.arma.isMagica()){
            System.out.println("Arma mágica");
        }
        else{
            System.out.println("Arma normal");
        }
    }

    //Método de mostra info do elfo
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Tribo do mago: " + this.tribo);
    }

    //Método de cura da interface
    public void curar(){
        this.energia += this.energia*0.15;
        System.out.println(this.nome + " foi curado");
    }
}
