package academy.javaoca.danieloliveira.poo.dominio9;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
