package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Etyos";
        carro.modelo = "Sedan";
        carro.ano = 2020;

        carro2.nome = "Logan";
        carro2.modelo = "sedan";
        carro2.ano = 2011;

        carro = carro2;

        System.out.println("\nNome: " +carro.nome+" Modelo: " +carro.modelo+ " Ano: "+carro.ano);
        System.out.println("Nome: " +carro2.nome+" Modelo: " +carro2.modelo+ " Ano: "+carro2.ano);
    }
}
