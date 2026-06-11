package academy.javaoca.danieloliveira.poo.dominio35.servico;

import academy.javaoca.danieloliveira.poo.dominio35.dominio.*;
import academy.javaoca.danieloliveira.poo.dominio35.repositorio.Tarifavel;

public class EmpresaTransporte {
    public static void imprimirTransportes (Transporte transporte){
        System.out.println("");
        System.out.println("Modelo " + transporte.getModelo());
        if(transporte instanceof Onibus){
            System.out.println("Tipo de transporte: Onibus");
        } else if (transporte instanceof Taxi) {
            System.out.println("Tipo de transporte: Taxi");
        } else if (transporte instanceof BicicletaCompartilhada) {
            System.out.println("Tipo de transporte: Bicicleta Compartilhada");
        }
        if(transporte.getTipoCombustivel() == TipoCombustivel.ETANOL){
            System.out.println("Tipo combustivel: ETANOL");
        } else if (transporte.getTipoCombustivel() == TipoCombustivel.ELETRICO) {
            System.out.println("Tipo combustivel: ELETRICO");
        } else if (transporte.getTipoCombustivel() == TipoCombustivel.GASOLINA) {
            System.out.println("Tipo combustivel: GASOLINA");
        }
        System.out.println("Capacidade: " + transporte.getCapacidadePassageiros());
        if(transporte instanceof Tarifavel){
            System.out.println("Tarifa: " + ((Tarifavel) transporte).calcularTarifa());
        }
    }

    public static double calculoValorTotal(Tarifavel[] tarifavels){
        double valorTotalArrecadado = 0;

        for (Tarifavel tarifavel : tarifavels) {
            valorTotalArrecadado = valorTotalArrecadado + tarifavel.calcularTarifa();
        }
        return valorTotalArrecadado;
    }

    public static void quantidadesTransportes(Transporte[] transportes){
        int totalDeOnibus = 0;
        int totalDeTaxi = 0;
        int totalDeBicicleta = 0;
        for (Transporte transporte : transportes) {
            if(transporte instanceof Onibus){
                totalDeOnibus++;
            } else if (transporte instanceof Taxi) {
                totalDeTaxi++;
            } else if (transporte instanceof BicicletaCompartilhada) {
                totalDeBicicleta++;
            }
        }
        System.out.println("Total de onibus: " + totalDeOnibus);
        System.out.println("Total de Bicicleta: " + totalDeBicicleta);
        System.out.println("Total de Taxi: " + totalDeTaxi);
    }

    public static void quantidadeTipoCombustivel(Transporte[] transportes){
        int totalGasolina = 0;
        int totalEletrico = 0;
        int totalEtanol = 0;

        for (Transporte transporte : transportes) {
                if(transporte.getTipoCombustivel() == TipoCombustivel.GASOLINA){
                    totalGasolina++;
                } else if (transporte.getTipoCombustivel() == TipoCombustivel.ELETRICO){
                    totalEletrico++;
                } else if (transporte.getTipoCombustivel() == TipoCombustivel.ETANOL) {
                    totalEtanol++;
                }
        }
        System.out.println("");
        System.out.println("Total de veiculos a Gasolina: " + totalGasolina);
        System.out.println("Total de veiculos Eletrico: " + totalEletrico);
        System.out.println("Total de veiculos a Etanol: " + totalEtanol);
    }
}
