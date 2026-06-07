package academy.javaoca.danieloliveira.poo.testExercicios;

import academy.javaoca.danieloliveira.poo.dominio9.Endereco;
import academy.javaoca.danieloliveira.poo.dominio9.Funcionario;
import academy.javaoca.danieloliveira.poo.dominio9.Pessoa;

public class Dominio9Test {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("722222");
        endereco.setRua("joao bosco");

        Pessoa pessoa = new Pessoa("Naruto");
        pessoa.setCpf("212312321");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Sasuke");
        funcionario.setCpf("123123123");
        funcionario.setSalario(1.9000);
        funcionario.setEndereco(endereco);

        funcionario.imprime();
    }
}
