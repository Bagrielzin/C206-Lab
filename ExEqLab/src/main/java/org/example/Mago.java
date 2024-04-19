package org.example;

public class Mago extends Habitante implements Feitico,Cura{

    //Atributos do mago
    private String cor;

    //Atributos herdados da super classe
    public Mago(String nome, int idade, float energia, String nomeArma, boolean magicaArma, String cor) {
        super(nome, idade, energia, nomeArma, magicaArma);
        this.cor = cor;
    }

    //Método atacar do mago
    @Override
    public void atacar(){
        if(arma.isMagica()){
            this.energia -= 20;
        }
        else{
            this.energia -= 10;
        }
        System.out.println("Mago atacou com " + this.arma.getNomeArma());
        if(this.arma.isMagica()){
            System.out.println("Arma mágica");
        }
        else{
            System.out.println("Arma normal");
        }
    }

    //Método mostra info do mago
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Cor do mago: " + this.cor);
    }

    //Método de lançar feitiço da interface
    public void lancaFeitico(){
        this.energia -= this.energia*0.1;
        System.out.println(this.nome + " soltou uma magia");
    }

    //Método de cura da interface
    public void curar(){
        this.energia += this.energia*0.15;
        System.out.println(this.nome + " foi curado");
    }

}
