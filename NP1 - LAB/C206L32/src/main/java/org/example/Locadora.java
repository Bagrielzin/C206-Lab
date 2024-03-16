package org.example;

public class Locadora {

    String nome;
    String CNPJ;
    String endereco;
    int carrosParaAlugar;
    Carro[] carros = new Carro[10];

    public Locadora(String nome, String CNPJ, String endereco, int carrosParaAlugar) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.carrosParaAlugar = carrosParaAlugar;
    }

    public void mostraInfo() {
        System.out.println("Nome da locadora: " + this.nome);
        System.out.println("CNPJ; " + this.CNPJ);
        System.out.println("Endereço da locadora: " + this.endereco);
        System.out.println(this.carrosParaAlugar + " carros pra alugar");
        System.out.println();
        for (int i = 0; i < carros.length; i++) {
            if(carros[i]!=null) {
                carros[i].mostraInfo();
            }
        }
    }

    public void adicionarCarro(Carro carro){
        for (int i = 0; i < carros.length; i++) {
            if(carros[i]==null){
                carros[i] = carro;
                this.carrosParaAlugar++;
                break;
            }
        }
    }

    public void alugarCarro(int index){
        for (int i = 0; i < carros.length; i++) {
            if(carros[i]!=null){
                if(carros[i].alugado == false){
                    index = i;
                    carros[i].alugado = true;
                    this.carrosParaAlugar--;
                    break;
                }
            }
        }
        System.out.println("Carro " + carros[index].modelo + " alugado");
    }

    public float contarCarrosParaAlugar(){
        float cart = 0;
        for (int i = 0; i < carros.length; i++) {
            if(carros[i]!=null){
                if(carros[i].alugado == false){
                    cart++;
                }
            }
        }
        return cart*100/this.carrosParaAlugar;
    }

}
