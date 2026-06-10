package academy.javaoca.danieloliveira.poo.dominio29.servico;

import academy.javaoca.danieloliveira.poo.dominio29.repositorio.Seguro;

public class Seguradora {
    public static double calcularTotalSeguros(Seguro[] seguros){
        double calculoTotalSeguros = 0;
        for (Seguro seguro : seguros) {
           calculoTotalSeguros = calculoTotalSeguros + seguro.calcularSeguro();
        }
        return calculoTotalSeguros;
    }
}
