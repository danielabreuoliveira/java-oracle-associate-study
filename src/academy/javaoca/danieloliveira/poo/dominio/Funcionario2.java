package academy.javaoca.danieloliveira.poo.dominio;

public class Funcionario2 {
    private String nome;
    private int idade;
    private double[] salarios;
    private double mediaSalario = 0;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMediaSalario() {
        return mediaSalario;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome + "\nidade: " + idade);
        for (double salario : salarios) {
            System.out.println(salario);
        }
        calculaMediaSalario();
    }

    public void calculaMediaSalario(){

        for (double salario: salarios){
            mediaSalario += salario;
        }
        mediaSalario /= salarios.length;
        System.out.println(mediaSalario);
    }


}
