package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Carro3;

public class Carro3Test {
    public static void main(String[] args) {
        Carro3 carro = new Carro3("BMW",280);
        Carro3 carro1 = new Carro3("Mercedez",265);
        Carro3 carro2 = new Carro3("Audi", 290);

        Carro3.setVelocidadeLimite(180);

        carro.imprime();
        carro1.imprime();
        carro2.imprime();

    }
}
