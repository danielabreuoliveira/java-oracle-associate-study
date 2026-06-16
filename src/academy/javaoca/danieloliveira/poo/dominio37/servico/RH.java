package academy.javaoca.danieloliveira.poo.dominio37.servico;

import academy.javaoca.danieloliveira.poo.dominio37.dominio.Funcionario;
import academy.javaoca.danieloliveira.poo.dominio37.dominio.TipoDeFuncionario;

public class RH {
    public static void imprimirRelatorioFunacionario(Funcionario funcionario){
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());
        System.out.println("Tipo de Funcionario: " + funcionario.getTipoDeFuncionario());
        System.out.println("");
    }

    public static void calcularTotalGastoPorFuncionario(Funcionario[] funcionario){
        double totalSalarios = 0;
        for (Funcionario funcionario1 : funcionario) {
            totalSalarios =  totalSalarios + funcionario1.getSalario();
        }
        System.out.println("Total gasto com salarios: " + totalSalarios);
    }

    public static void calcularTotalGastoPorBonus(Funcionario[] funcionarios){
        double totalBonus = 0;
        for (Funcionario funcionario : funcionarios) {
            totalBonus = totalBonus + funcionario.calcularBonus();
        }
        System.out.println("Total gasto com bonus: " + totalBonus);
    }

    public static void maiorBonus(Funcionario [] funcionarios){
        double maiorBonus = funcionarios[0].calcularBonus();
        String nomeFuncionario = funcionarios[0].getNome();

        for (Funcionario funcionario : funcionarios) {
            if(maiorBonus < funcionario.calcularBonus()){
                maiorBonus = funcionario.calcularBonus();
                nomeFuncionario = funcionario.getNome();
            }
        }
        System.out.println("Funcionario com maior bonus é: " + nomeFuncionario + " com bonus de: " + maiorBonus);
    }

    public static void menorBonus(Funcionario[] funcionarios){
        double menorBonus = funcionarios[0].calcularBonus();
        String nomeFuncionario = funcionarios[0].getNome();

        for (Funcionario funcionario : funcionarios) {
            if(menorBonus > funcionario.calcularBonus()){
                menorBonus = funcionario.calcularBonus();
                nomeFuncionario = funcionario.getNome();
            }
        }
        System.out.println("Funcionario com  menor bonus é: " + nomeFuncionario + " com bonus de: " + menorBonus);

    }

    public static void mediaSalarial(Funcionario[] funcionarios){
        double somaSalarios = 0;

        for (Funcionario funcionario : funcionarios) {
            somaSalarios = somaSalarios + funcionario.getSalario();
        }
        double mediaSalarial = somaSalarios/ funcionarios.length;
        System.out.println("Media salarial dos funcionario: " + mediaSalarial);
    }

    public static void totalFuncionarios(Funcionario[] funcionarios){
        int totalFuncionarios = 0;
        for (Funcionario funcionario : funcionarios) {
            totalFuncionarios++;
        }
        System.out.println("Quantiade de funcionarios: " + totalFuncionarios);
    }
}
