package academy.javaoca.danieloliveira.fundamentos.vetores.estruturaDados;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    };
    /*
    public void adiciona(String elemento){
        for (int i = 0; i < this.elementos.length; i++) {
                if(elementos[i] == null){
                    this.elementos[i] = elemento;
                    break;
                }
        }
    }*/
    public void adiciona(String elemento) {
        if(this.tamanho<this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
        }


    public int tamanho(){
        return  this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for (int i = 0; i <this.tamanho-1; i++) {
            stringBuilder.append(this.elementos[i]);
            stringBuilder.append(",");
        }
        if (this.tamanho>0){
            stringBuilder.append(this.elementos[this.tamanho-1]);
        }

        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
