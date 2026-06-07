package academy.javaoca.danieloliveira.poo.dominio16;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario, departamento);
    }

    public void exibirDados(){
        System.out.println("\n Nome: " + getNome() + "\n Salario: " + salario + "\n Departamento: " + departamento);
    }
}
