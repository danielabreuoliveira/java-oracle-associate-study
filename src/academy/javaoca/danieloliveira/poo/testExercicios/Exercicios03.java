package academy.javaoca.danieloliveira.poo.testExercicios;

import academy.javaoca.danieloliveira.poo.dominio5.Carro;
import academy.javaoca.danieloliveira.poo.dominio5.Dono;
import academy.javaoca.danieloliveira.poo.dominio5.Mecanico;
import academy.javaoca.danieloliveira.poo.dominio5.Oficina;

public class Exercicios03 {
    public static void main(String[] args) {
        Dono dono = new Dono("Daniel", 123232213);
        Oficina oficina = new Oficina("Taubate peças","rua das verduras");

        Carro[] carros = new Carro[2];

        carros[0] = new Carro("Ethios","12312323",2020);
        carros[1] = new Carro("Logan", "22132323", 2011);

        Carro[] carroConsertadosPelojoao = new Carro[1];

        carroConsertadosPelojoao[0] = carros[0];

        Carro[] carrocorsetadospelojose = new Carro[1];

        carrocorsetadospelojose[0] = carros[1];

        Mecanico[] mecanicos = new Mecanico[2];

        mecanicos[0] = new Mecanico("joao","pintura");
        mecanicos[1] = new Mecanico("José","lanternagem");

        carros[0].setDono(dono);
        carros[1].setDono(dono);
        carrocorsetadospelojose[0].setDono(dono);
        carroConsertadosPelojoao[0].setDono(dono);
        dono.setCarros(carros);

        oficina.setCarros(carros);
        oficina.setMecanicos(mecanicos);

        mecanicos[0].setCarrosConsertados(carroConsertadosPelojoao);
        mecanicos[1].setCarrosConsertados(carroConsertadosPelojoao);

        oficina.imprime();
    }
}
