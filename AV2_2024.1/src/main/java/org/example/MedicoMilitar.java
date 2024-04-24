package org.example;

public class MedicoMilitar extends Soldado implements Curar{

    //Atributos do médico
    private int anosEsperiencia;
    private int capacidadeEmergencia;

    //Constructors do médico
    public MedicoMilitar(String nome, long cpf, ItemEspecial itemEspecial, int anosEsperiencia, int capacidadeEmergencia) {
        super(nome, cpf, itemEspecial);
        this.anosEsperiencia = anosEsperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia;
    }

    public MedicoMilitar(String nome, long cpf, int anosEsperiencia, int capacidadeEmergencia) {
        super(nome, cpf);
        this.anosEsperiencia = anosEsperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia;
    }

    //Método mostra info do médico
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Anos de experiência: " + this.anosEsperiencia);
        System.out.println("Capacidade de emergência: " + this.capacidadeEmergencia);
    }

    //Método usar item do médico
    @Override
    public void usandoItem() {
        if(this.getItemEspecial()!=null){
            System.out.println(super.getNome() + " utilizando item especial");
            this.capacidadeEmergencia += 100;
        }
        else{
            System.out.println(super.getNome() + " não tem item especial para utilizar");
        }
    }

    //Método curar do médico
    @Override
    public void curar() {
        if(this.capacidadeEmergencia>=920){
            System.out.println(super.getNome() + " curou um indivíduo");
        }
        else{
            System.out.println(super.getNome() + " não conseguiu curar");
        }
    }
}
