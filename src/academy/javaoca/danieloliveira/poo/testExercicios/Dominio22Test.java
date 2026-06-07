package academy.javaoca.danieloliveira.poo.testExercicios;

import academy.javaoca.danieloliveira.poo.dominio22.Desenvolvedor;
import academy.javaoca.danieloliveira.poo.dominio22.Funcionario;
import academy.javaoca.danieloliveira.poo.dominio22.Gerente;

public class Dominio22Test {
    public static void main(String[] args) {
        Gerente gerente01 = new Gerente("Joao",5000);
        Desenvolvedor desenvolvedor01 = new Desenvolvedor("Daniel",12000);
        System.out.println(gerente01);
        System.out.println(desenvolvedor01);
        gerente01.imprime();
        desenvolvedor01.imprime();
    }
}
