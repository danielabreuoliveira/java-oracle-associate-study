package academy.javaoca.danieloliveira.exceptions.exception.test;

import academy.javaoca.danieloliveira.exceptions.dominio.Funcionario;
import academy.javaoca.danieloliveira.exceptions.dominio.LoginInvalidoException;
import academy.javaoca.danieloliveira.exceptions.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
