package academy.javaoca.danieloliveira.poo.dominio37.dominio;

public class Funcionario {
    private String nome;
    private double salario;
    TipoDeFuncionario tipoDeFuncionario;

    public Funcionario(String nome, double salario, TipoDeFuncionario tipoDeFuncionario) {
        this.nome = nome;
        this.salario = salario;
        this.tipoDeFuncionario = tipoDeFuncionario;
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

    public TipoDeFuncionario getTipoDeFuncionario() {
        return tipoDeFuncionario;
    }

    public void setTipoDeFuncionario(TipoDeFuncionario tipoDeFuncionario) {
        this.tipoDeFuncionario = tipoDeFuncionario;
    }

    public double calcularBonus(){
        return 0;
    }
}
