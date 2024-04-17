package org.example;

public class TerraMedia {

    Habitante[] herois = new Habitante[10];

    public void addHabitante(Habitante habitante){
        for (int i = 0; i < herois.length; i++) {
            if(herois[i]==null) {
                herois[i] = habitante;
                break;
            }
        }
    }

    public void listarHabitantes(){
        System.out.println("Total de habitantes: " + Habitante.contador);
        for (int i = 0; i < herois.length; i++) {
            if(herois[i]!=null){
                if(herois[i] instanceof Anao){
                    Anao ax = (Anao) herois[i];
                    ax.mostraInfo();
                    ax.atacar();
                    ax.minerar();
                    System.out.println();
                }

                if(herois[i] instanceof Elfo){
                    Elfo ex = (Elfo) herois[i];
                    ex.mostraInfo();
                    ex.atacar();
                    ex.viajar();
                    ex.curar();
                    System.out.println();
                }

                if(herois[i] instanceof Mago){
                    Mago mx = (Mago) herois[i];
                    mx.mostraInfo();
                    mx.atacar();
                    mx.curar();
                    mx.lancaFeitico();
                    System.out.println();
                }
            }
        }
    }

}
