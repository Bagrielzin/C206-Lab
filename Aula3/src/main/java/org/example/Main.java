package org.example;

class Main {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario("Gabriel",21,1100);
        Funcionario func2 = new Funcionario("Eduardo",20,800);

        /*
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();

        func1.nome = "Dudu";
        func1.idade = 20;
        func1.salario = 1100;

        func2.nome = "Gabriel";
        func2.idade = 21;
        func2.salario = 800;
         */

        System.out.println("Caracteristicas dos funcionarios");
        System.out.println(func1.nome);
        System.out.println(func1.idade);
        System.out.println(func1.salario);
        //System.out.println(func1);
        System.out.println();
        System.out.println(func2.nome);
        System.out.println(func2.idade);
        System.out.println(func2.salario);
        //System.out.println(func2);

        System.out.println("O  salarios anual do " + func1.nome + " é " + func1.calculaSalarioAnual());
        System.out.println("O  salarios anual do " + func2.nome + " é " + func2.calculaSalarioAnual());

        System.out.println("O decimo terceio do " + func1.nome + " é " + func1.calculaDecimoTerceiro());
        System.out.println("O decimo terceio do " + func2.nome + " é " + func2.calculaDecimoTerceiro());


    }
}