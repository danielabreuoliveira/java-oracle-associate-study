package academy.javaoca.danieloliveira.poo.dominio;

public class Funcionario {
    public String nome;
    public double salario;

    public double calcularBonus(){
        if(salario<=5000) {
            double bonus = (salario * 0.10);
            return bonus;
        }else {
            double bonus = (salario * 0.20);
            return bonus;
        }
    }

    public void mostrarDados(){
        double salarioFinal = calcularBonus() + salario;
        System.out.println("Nome: " + nome + "\nSalario: " + salario + "\nBonus: " + calcularBonus() + "\nSalario Final: " + salarioFinal);
    }
}
