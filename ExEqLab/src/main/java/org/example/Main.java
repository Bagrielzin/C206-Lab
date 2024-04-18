package org.example;

public class Main {
    public static void main(String[] args) {

        //Instanciando os herois e a terra media
        Habitante[] herois = new Habitante[10];
        TerraMedia terraMedia  = new TerraMedia();

        //Criando novos habitantes
        Anao a = new Anao(1,"Schuller",20, 100,"Isqueiro",true,1.5F,"Sr");
        Elfo e = new Elfo(2,"Lego",30,100,"Arco",false,"Sentinela");
        Mago m = new Mago(3,"Gandalf",70,100,"Cajado",true,"Cinza");

        //Introduzino novos habitantes na terra média
        terraMedia.addHabitante(a);
        terraMedia.addHabitante(e);
        terraMedia.addHabitante(m);

        //Listando os habitantes
        terraMedia.listarHabitantes();
    }
}