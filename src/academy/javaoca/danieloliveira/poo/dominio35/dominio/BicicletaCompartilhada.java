package academy.javaoca.danieloliveira.poo.dominio35.dominio;

import academy.javaoca.danieloliveira.poo.dominio35.repositorio.Tarifavel;

public class BicicletaCompartilhada extends Transporte implements Tarifavel {
    public BicicletaCompartilhada(String modelo, int capacidadePassageiros, TipoCombustivel tipoCombustivel) {
        super(modelo, capacidadePassageiros, tipoCombustivel);
    }

    @Override
    public double calcularTarifa() {
        return 2.00*getCapacidadePassageiros();
    }
}
