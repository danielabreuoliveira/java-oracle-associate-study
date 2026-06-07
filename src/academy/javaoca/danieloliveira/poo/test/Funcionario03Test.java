package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Funcionario3;

public class Funcionario03Test {
    public static void main(String[] args) {
        Funcionario3[] funcionarios = new Funcionario3[3];
        funcionarios[0] = new Funcionario3();
        funcionarios[1] = new Funcionario3();
        funcionarios[2] = new Funcionario3();

        funcionarios[0].setNome("joao");
        funcionarios[0].setSalario(1001);
        funcionarios[0].setIdade(31);

        funcionarios[1].setNome("Maria");
        funcionarios[1].setSalario(2222);
        funcionarios[1].setIdade(17);

        funcionarios[2].setNome("Joana");
        funcionarios[2].setSalario(3333);
        funcionarios[2].setIdade(55);
        /*
        double mediaSalarial = 0;
        double somaSalario = 0;
        for (Funcionario3 funcionario : funcionarios) {
            somaSalario += funcionario.getSalario();
            System.out.println("Funcionario: " + funcionario.getNome() + " Salario: " + funcionario.getSalario());
        }
        mediaSalarial = somaSalario / funcionarios.length;
        System.out.println("----------------------------------");
        System.out.println("A Media salarial da equipe é: " + mediaSalarial);
        System.out.println("----------------------------------");

        double maiorSalario = funcionarios[0].getSalario();
        String nomeSalario = funcionarios[0].getNome();
        for (Funcionario3 funcionario : funcionarios) {
            if (maiorSalario < funcionario.getSalario()) {
                nomeSalario = funcionario.getNome();
                maiorSalario = funcionario.getSalario();
            }
        }
        System.out.println("Funcionario com maior salario é: " +nomeSalario);
        System.out.println("------------------------");

        double menorSalario = funcionarios[0].getSalario();
        String nomeFuncionario = funcionarios[0].getNome();
        for (Funcionario3 funcionario: funcionarios){
            if(menorSalario > funcionario.getSalario()){
                nomeFuncionario = funcionario.getNome();
                menorSalario = funcionario.getSalario();
            }
        }
        System.out.println("Funcionario com menor salario: " +nomeFuncionario+ " com salario de: " +menorSalario);
        System.out.println("-------------------------");

        int contador = 0;
        for (Funcionario3 funcionario: funcionarios){
            if(funcionario.getSalario()>2000){
                contador++;
            }
        }
        System.out.println("Quantidade de funcionarios que ganham acima de 2000: " + contador);
        System.out.println("--------------------------------");

        double soma = 0;
        for (Funcionario3 funcionario: funcionarios){
            soma += funcionario.getSalario();
        }
        System.out.println("A soma de todos os salarios: " + soma);*/

        double mediaIdade = 0;
        double todasIdades = 0;
        for (Funcionario3 funcionario: funcionarios){
            todasIdades += funcionario.getIdade();
        }
        mediaIdade = todasIdades/ funcionarios.length;
        System.out.println("A media de idade dos funcionarios é: " + mediaIdade + " anos");
        System.out.println("------------------------------");

        double maisVelha = funcionarios[0].getIdade();
        String nomeVelho = funcionarios[0].getNome();
        double maisNovo = funcionarios[0].getIdade();
        String nomeNovo = funcionarios[0].getNome();

        for(Funcionario3 funcionario: funcionarios){
            if(maisVelha < funcionario.getIdade()){
               maisVelha = funcionario.getIdade();
               nomeVelho = funcionario.getNome();
            }
            if(maisNovo > funcionario.getIdade()){
                maisNovo = funcionario.getIdade();
                nomeNovo = funcionario.getNome();
            }
        }
        System.out.println("A funcionario(a)o " + nomeVelho + " é a mais velha com: " + maisVelha + " anos");
        System.out.println("A funcionario(a)o " + nomeNovo + " é a mais nova com: " + maisNovo + " anos");
    }
}
