package academy.javaoca.danieloliveira.poo.testExercicios;

import academy.javaoca.danieloliveira.poo.dominio19.Funcionario;
import academy.javaoca.danieloliveira.poo.dominio19.NivelAcesso;

public class Dominio19Test {
    public static void main(String[] args) {
        Funcionario funcionarios1 = new Funcionario("Daniel",NivelAcesso.ADMIN);
        Funcionario funcionarios2 = new Funcionario("Joao", NivelAcesso.USUARIO);
        Funcionario funcionarios3 = new Funcionario("Gabriel", NivelAcesso.GERENTE);

        funcionarios1.visualizar();
        funcionarios2.visualizar();
        funcionarios3.visualizar();

    }
}
