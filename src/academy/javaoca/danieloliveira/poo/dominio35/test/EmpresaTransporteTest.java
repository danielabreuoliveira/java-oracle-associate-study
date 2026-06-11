package academy.javaoca.danieloliveira.poo.dominio35.test;

import academy.javaoca.danieloliveira.poo.dominio35.dominio.*;
import academy.javaoca.danieloliveira.poo.dominio35.repositorio.Ligavel;
import academy.javaoca.danieloliveira.poo.dominio35.repositorio.Tarifavel;
import academy.javaoca.danieloliveira.poo.dominio35.servico.EmpresaTransporte;

public class EmpresaTransporteTest {
    public static void main(String[] args) {
        Onibus onibus1 = new Onibus("Convencional", 55, TipoCombustivel.ETANOL);
        Onibus onibus2 = new Onibus("Executivo", 45, TipoCombustivel.ELETRICO);
        Onibus onibus3 = new Onibus("Semi-Leito", 45, TipoCombustivel.GASOLINA);
        Onibus onibus4 = new Onibus("Leito", 45, TipoCombustivel.GASOLINA);

        Taxi taxi1 = new Taxi("Luxo", 5, TipoCombustivel.ELETRICO);
        Taxi taxi2 = new Taxi("Comum", 5, TipoCombustivel.GASOLINA);
        Taxi taxi3 = new Taxi("Acessivel", 5 , TipoCombustivel.GASOLINA);

        BicicletaCompartilhada bicicletaCompartilhada1 = new BicicletaCompartilhada("Com estações", 3,TipoCombustivel.ELETRICO);
        BicicletaCompartilhada bicicletaCompartilhada2 = new BicicletaCompartilhada("Sem estações", 3,TipoCombustivel.ELETRICO);

        Transporte[] transportes = {
                onibus1,onibus2,onibus3,onibus4,
                taxi1,taxi2,taxi3,
                bicicletaCompartilhada1,bicicletaCompartilhada2
        };

        for (Transporte transporte : transportes) {
            EmpresaTransporte.imprimirTransportes(transporte);
        }

        Ligavel[] ligavels = {
                onibus1,onibus2,onibus3,onibus4,
                taxi1,taxi2,taxi3
        };

        for (Ligavel ligavel : ligavels) {
            System.out.println("");
            ligavel.ligar();
            ligavel.desligar();
        }

        Tarifavel[] tarifavels = {
            onibus1,onibus2,onibus3,onibus4,
                    taxi1,taxi2,taxi3,
                    bicicletaCompartilhada1,bicicletaCompartilhada2
        };

        EmpresaTransporte.calculoValorTotal(tarifavels);
        EmpresaTransporte.quantidadesTransportes(transportes);
        EmpresaTransporte.quantidadeTipoCombustivel(transportes);

    }
}
