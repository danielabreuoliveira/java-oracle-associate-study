package academy.javaoca.danieloliveira.poo.testExercicios;

import academy.javaoca.danieloliveira.poo.dominio11.Carro;
import academy.javaoca.danieloliveira.poo.dominio11.Comprador;

public class Dominio11Test {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();

        //System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
