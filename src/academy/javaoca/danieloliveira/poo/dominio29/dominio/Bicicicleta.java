package academy.javaoca.danieloliveira.poo.dominio29.dominio;

import academy.javaoca.danieloliveira.poo.dominio29.repositorio.Movel;
import academy.javaoca.danieloliveira.poo.dominio29.repositorio.Seguro;

public class Bicicicleta extends Veiculo implements Movel, Seguro {
    private double valorFiciticio = 1500;
    public Bicicicleta(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public String mover() {
        return "Bicicleta em movimento";
    }

    @Override
    public double calcularSeguro() {
        return valorFiciticio = valorFiciticio + (valorFiciticio*0.1);
    }
}
