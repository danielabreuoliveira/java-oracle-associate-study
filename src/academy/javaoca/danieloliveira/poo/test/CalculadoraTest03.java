package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divideDoisNumeros(20,2);
        System.out.println(resultado);
        System.out.println("------------------------------");
        calculadora.imprimiDivisaoDeDoisNumeros(20,2);
    }
}
