package org.example;

public class Sargento extends Soldado implements Defesa{

    //Atributos do sargento
    private String especialização;
    private int experienciaCombate;

    //Contructors do sargento
    public Sargento(String nome, long cpf, ItemEspecial itemEspecial, String especialização, int experienciaCombate) {
        super(nome, cpf, itemEspecial);
        this.especialização = especialização;
        this.experienciaCombate = experienciaCombate;
    }

    public Sargento(String nome, long cpf, String especialização, int experienciaCombate) {
        super(nome, cpf);
        this.especialização = especialização;
        this.experienciaCombate = experienciaCombate;
    }

    //Método mostra info do sargento
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Especialização: " + this.especialização);
        System.out.println("Experiencia: " + this.experienciaCombate);
    }

    //Método usar item do sargento
    @Override
    public void usandoItem(){
        if(this.getItemEspecial()!=null){
            System.out.println(super.getNome() + " utilizando item especial");
            this.experienciaCombate += 300;
        }
        else{
            System.out.println(super.getNome() + " não tem item especial para utilizar");
        }
    }

    //Método de defesa do sargento
    @Override
    public void defender() {
        if(this.experienciaCombate>=650){
            System.out.println(super.getNome() + " conseguiu se defender");
        }
        else{
            System.out.println(super.getNome() + " não se defendeu");
        }
    }
}
