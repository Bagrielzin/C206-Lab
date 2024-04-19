package org.example;

public class Main {
    public static void main(String[] args) {

        //Instanciando os herois e a terra media
        TerraMedia terraMedia  = new TerraMedia();

        //Criando novos habitantes
        Anao a = new Anao("Schuller",20, 100,"Isqueiro",true,1.5F,"Sr");
        Elfo e = new Elfo("Lego",30,100,"Arco",false,"Sentinela");
        Mago m = new Mago("Gandalf",70,100,"Cajado",true,"Cinza");

        //Introduzino novos habitantes na terra média
        terraMedia.addHabitante(a);
        terraMedia.addHabitante(e);
        terraMedia.addHabitante(m);

        //Listando os habitantes
        terraMedia.listarHabitantes();
    }
}