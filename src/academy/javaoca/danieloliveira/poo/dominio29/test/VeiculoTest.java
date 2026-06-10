package academy.javaoca.danieloliveira.poo.dominio29.test;

import academy.javaoca.danieloliveira.poo.dominio29.dominio.Bicicicleta;
import academy.javaoca.danieloliveira.poo.dominio29.dominio.Carro;
import academy.javaoca.danieloliveira.poo.dominio29.dominio.Moto;
import academy.javaoca.danieloliveira.poo.dominio29.dominio.Veiculo;
import academy.javaoca.danieloliveira.poo.dominio29.repositorio.Ligavel;
import academy.javaoca.danieloliveira.poo.dominio29.repositorio.Movel;
import academy.javaoca.danieloliveira.poo.dominio29.repositorio.Seguro;
import academy.javaoca.danieloliveira.poo.dominio29.servico.Oficina;
import academy.javaoca.danieloliveira.poo.dominio29.servico.Pista;
import academy.javaoca.danieloliveira.poo.dominio29.servico.Seguradora;

public class VeiculoTest {
    public static void main(String[] args) {
        Veiculo[] veiculos = {
           new Carro("Gol",2012),
                new Carro("Ethios", 2021),
                new Moto("125cc", 2022),
                new Moto("122cc", 2002),
                new Bicicicleta("montay bike", 2021),
                new Bicicicleta("croisinha", 2011)
        };

        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.gerarRelatorio());
        }
        Movel[] movels = {
                new Carro("Gol",2012),
                new Carro("Ethios", 2021),
                new Moto("125cc", 2022),
                new Moto("122cc", 2002),
                new Bicicicleta("montay bike", 2021),
                new Bicicicleta("croisinha", 2011)
        };
        for (Movel movel : movels) {
            Pista.testarMovimento(movel);
        }

        Ligavel[] ligavels = {
                new Carro("Gol",2012),
                new Carro("Ethios", 2021),
                new Moto("125cc", 2022),
                new Moto("122cc", 2002),
        };

        for (Ligavel ligavel : ligavels) {
            Oficina.testarVeiculo(ligavel);
        }

        Seguro[] seguros = {
                new Carro("Gol",2012),
                new Carro("Ethios", 2021),
                new Moto("125cc", 2022),
                new Moto("122cc", 2002),
                new Bicicicleta("montay bike", 2021),
                new Bicicicleta("croisinha", 2011)
        };

        System.out.println("Valor total dos seguros: " + Seguradora.calcularTotalSeguros(seguros));

    }
}
