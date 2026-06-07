package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Carro2;

public class Carro2Test {
    public static void main(String[] args) {
        Carro2 carro = new Carro2();

        carro.marca = "Toytota";
        carro.modelo = "Sedan";
        carro.ano = 2020;

        carro.ligar();
        carro.desligar();
    }
}
