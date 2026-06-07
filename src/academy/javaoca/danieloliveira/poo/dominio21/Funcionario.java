package academy.javaoca.danieloliveira.poo.dominio21;

public class Funcionario {
    private String nome;
    private double salario;
    private Cargo cargo;

    public Funcionario(String nome, double salario, Cargo cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("---------------------");
    }

    public final void apresentar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Bonus: " + cargo.getBonus());
        System.out.println("---------------------");
    }


    public double calcularBonus(){
        return 0;
    }
}
