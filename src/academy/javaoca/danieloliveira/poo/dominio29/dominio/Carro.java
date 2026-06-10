package academy.javaoca.danieloliveira.poo.dominio29.dominio;

import academy.javaoca.danieloliveira.poo.dominio29.repositorio.Ligavel;
import academy.javaoca.danieloliveira.poo.dominio29.repositorio.Movel;
import academy.javaoca.danieloliveira.poo.dominio29.repositorio.Seguro;

public class Carro extends Veiculo implements Ligavel, Movel, Seguro {
    private double valorFiciticio = 65000;
    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public String ligar() {
        return "Carro Ligado";
    }

    @Override
    public String desligar() {
        return "Carro desligado";
    }

    @Override
    public String mover() {
        return "Carro em movimento";
    }

    @Override
    public double calcularSeguro() {
        return valorFiciticio = valorFiciticio + (valorFiciticio*0.5);
    }
}
