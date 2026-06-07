package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Funcionario4;

public class Funcionario04Test {
    public static void main(String[] args) {
        Funcionario4[] funcionarios = new Funcionario4[5];

        funcionarios[0] = new Funcionario4();
        funcionarios[0].setNome("Daniel");
        funcionarios[0].setIdade(1);
        funcionarios[0].setSalario(2.510);

        funcionarios[1] = new Funcionario4();
        funcionarios[1].setNome("José");
        funcionarios[1].setIdade(2);
        funcionarios[1].setSalario(1.510);

        funcionarios[2] = new Funcionario4();
        funcionarios[2].setNome("Maria");
        funcionarios[2].setIdade(3);
        funcionarios[2].setSalario(3.510);

        funcionarios[3] = new Funcionario4();
        funcionarios[3].setNome("joao");
        funcionarios[3].setIdade(4);
        funcionarios[3].setSalario(1.310);

        funcionarios[4] = new Funcionario4();
        funcionarios[4].setNome("Cecilia");
        funcionarios[4].setIdade(5);
        funcionarios[4].setSalario(0);

        int funcionarioMaisVelho = funcionarios[0].getIdade();
        int funcionarioMaisNovo = funcionarios[0].getIdade();
        int somaIdades = 0;
        int mediaIdades = 0;
        int contadorAcimaMediaIdade = 0;
        double somaSalarial = 0;
        double mediaSalarial = 0;
        int contadorAcimaMediaSalario = 0;
        int contadorAbaixoMediaSalario = 0;

        for (Funcionario4 funcionario: funcionarios){
            if(funcionarioMaisVelho < funcionario.getIdade()) {
                funcionarioMaisVelho = funcionario.getIdade();
            }
            if(funcionarioMaisNovo > funcionario.getIdade()) {
                funcionarioMaisNovo = funcionario.getIdade();
            }
            somaIdades += funcionario.getIdade();
            mediaIdades = somaIdades/ funcionarios.length;
            somaSalarial += funcionario.getSalario();
            mediaSalarial = somaSalarial/ funcionarios.length;
        }
        for (Funcionario4 funcionario1: funcionarios){
            if(funcionario1.getIdade() > mediaIdades){
                contadorAcimaMediaIdade++;
            }
            if (funcionario1.getSalario() > mediaSalarial){
                contadorAcimaMediaSalario++;
            }
            if (funcionario1.getSalario() < mediaSalarial){
                contadorAbaixoMediaSalario++;
            }
        }
        System.out.println("Idade do funcionario mais velho: " + funcionarioMaisVelho);
        System.out.println("Idade do funcionario mais novo: " + funcionarioMaisNovo);
        System.out.println("Soma das idades: " + somaIdades);
        System.out.println("Media idades: " + mediaIdades);
        System.out.println("Acima da media salarial: " + contadorAcimaMediaSalario);
        System.out.println("ABaixo da media salarial: " + contadorAbaixoMediaSalario);

    }
}
