package org.example;

public class Main {
    public static void main(String[] args) {

        //Instanciando o exército
        Exercito exercito = new Exercito("Tropa de elite");

        //Criando itens especiais
        ItemEspecial i1 = new ItemEspecial("arma");
        ItemEspecial i2 = new ItemEspecial("mantimento");
        ItemEspecial i3 = new ItemEspecial("disfibrilador");

        //Criando soldados
        Sargento s = new Sargento("João",12345678,i1,"Combate",600);
        Oficial o = new Oficial("Zé",382738,i2,"marechal");
        MedicoMilitar m = new MedicoMilitar("House",99986545,i3,10,860);
        Sargento s2 = new Sargento("Patati",22334455,"dormir",20);

        //Adicionando soldados ao exército
        exercito.addSoldado(s);
        exercito.addSoldado(o);
        exercito.addSoldado(m);
        exercito.addSoldado(s2);

        //Mostrando informações do exército
        exercito.mostraInfo();
    }
}