package org.example;

public class Main {
    public static void main(String[] args) {

        Habitante[] herois = new Habitante[10];

        Anao a = new Anao(1,"Schuller",20, 100,"Isqueiro",true,1.5F,"Sr");
        Elfo e = new Elfo(2,"lego",30,100,"Arco",false,"Sentinela");
        Mago m = new Mago(3,"Gandalf",70,100,"Cajado",true,"Cinza");
    
        herois[0] = a;
        herois[1] = e;
        herois[2] = m;

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