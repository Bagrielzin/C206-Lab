package org.example;

public class Oficial extends Soldado implements Defesa{

    //Atributos do oficial
    String patente;

    //Constructors do oficial
    public Oficial(String nome, long cpf, ItemEspecial itemEspecial, String patente) {
        super(nome, cpf, itemEspecial);
        this.patente = patente;
    }

    public Oficial(String nome, long cpf, String patente) {
        super(nome, cpf);
        this.patente = patente;
    }

    //Método mostra info do oficial
    @Override
    public void mostraInfo() {
        super.mostraInfo();
    }

    //Método usar item do oficial
    @Override
    public void usandoItem() {
        if(this.getItemEspecial()!=null){
            System.out.println(super.getNome() + " utilizando item especial");
        }
        else{
            System.out.println(super.getNome() + " não tem item especial para utilizar");
        }
    }

    //Método de defesa do oficial
    @Override
    public void defender() {
        if(this.getItemEspecial()!=null){
            System.out.println(super.getNome() + " conseguiu se defender");
        }
        else{
            System.out.println(super.getNome() + " não se defendeu");
        }
    }
}
