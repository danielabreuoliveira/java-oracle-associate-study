package academy.javaoca.danieloliveira.poo.dominio29.dominio;

import academy.javaoca.danieloliveira.poo.dominio29.repositorio.Ligavel;
import academy.javaoca.danieloliveira.poo.dominio29.repositorio.Movel;
import academy.javaoca.danieloliveira.poo.dominio29.repositorio.Seguro;

public class Moto extends Veiculo implements Ligavel, Movel, Seguro{
    private double valorFiciticio = 12000;
    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public String ligar() {
        return "Moto Ligando";
    }

    @Override
    public String desligar() {
        return "Moto Desligando";
    }

    @Override
    public String mover() {
        return "Moto em movimento";
    }
    @Override
    public double calcularSeguro() {
        return valorFiciticio = valorFiciticio + (valorFiciticio*0.3);
    }
}
