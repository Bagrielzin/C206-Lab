package org.example;

public abstract class  Astronauta {

    private static int qtdAstronauta = 0;
    protected String nome;
    protected String cor;
    protected Skin skin;
    protected Pet pet;

    public Astronauta(String nome, String cor, String tiposkin, String tipopet) {
        this.nome = nome;
        this.cor = cor;
        this.skin = new Skin(tiposkin);
        this.pet = new Pet(tipopet);
    }

    public Astronauta(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public void mostraInfo(){
        System.out.println("Nome do tripulante: " + this.nome);
        System.out.println("Cor do tripulante: " + this.cor);
        if(this.skin != null)
            System.out.println("Tipo da skin: " + skin.getTipo());
        if(this.pet != null)
            System.out.println("Tipo do pet: " + pet.getTipo());
    }

    public abstract void reportar();

    public abstract void votar();
}
