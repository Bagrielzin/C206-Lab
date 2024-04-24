package org.example;

public abstract class Soldado {

    //Atributos do soldado
    private static int qtdSoldado = 0;
    private String nome;
    private long cpf;
    private ItemEspecial itemEspecial;

    //Constructors do soldado
    public Soldado(String nome, long cpf, ItemEspecial itemEspecial) {
        this.nome = nome;
        this.cpf = cpf;
        this.itemEspecial = itemEspecial;
        qtdSoldado++;
    }

    public Soldado(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        qtdSoldado++;
    }

    //Método mostra info do soldado
    public void mostraInfo(){
        System.out.println("Nome do soldado: " + this.nome);
        System.out.println("CPF do soldado: " + this.cpf);
    }

    //Método abstrato do usar item
    public abstract void usandoItem();

    //Getters do soldado
    public static int getQtdSoldado() {
        return qtdSoldado;
    }

    public String getNome() {
        return nome;
    }

    public ItemEspecial getItemEspecial() {
        return itemEspecial;
    }
}
