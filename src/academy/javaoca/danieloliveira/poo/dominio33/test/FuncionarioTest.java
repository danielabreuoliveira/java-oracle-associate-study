package academy.javaoca.danieloliveira.poo.dominio33.test;

import academy.javaoca.danieloliveira.poo.dominio33.dominio.Desenvolvedor;
import academy.javaoca.danieloliveira.poo.dominio33.dominio.Estagiario;
import academy.javaoca.danieloliveira.poo.dominio33.dominio.Funcionario;
import academy.javaoca.danieloliveira.poo.dominio33.dominio.Gerente;
import academy.javaoca.danieloliveira.poo.dominio33.repositorio.Cargo;
import academy.javaoca.danieloliveira.poo.dominio33.servico.RH;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Joao",20000, Cargo.GERENTE);
        Gerente gerente2 = new Gerente("Joana",10000, Cargo.GERENTE);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Joana.jr",5000, Cargo.DESENVOLVEDOR);
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("Joao.jr",7000, Cargo.DESENVOLVEDOR);
        Estagiario estagiario1 = new Estagiario("Ronaldo", 750, Cargo.ESTAGIARIO);
        Estagiario estagiario2 = new Estagiario("Carla", 500,Cargo.ESTAGIARIO);

        Funcionario[] funcionarios = {
                gerente1,gerente2,
                desenvolvedor1, desenvolvedor2,
                estagiario1, estagiario2
        };

        for (Funcionario funcionario : funcionarios) {
            RH.imprimirRelatorio(funcionario);
            System.out.println("\n---------------------");
        }

        double totalBonus = RH.calcularTotalBonus(funcionarios);
        System.out.println("Total dos bonus: " + totalBonus);

        System.out.println("Numero de gerentes: " + RH.contarGerente(funcionarios));
        System.out.println("Numero de desenvolvedores: " + RH.contarDesenvolvedor(funcionarios));
        System.out.println("Numero de Estagiarios: " + RH.contarEstagioario(funcionarios));

    }

}
