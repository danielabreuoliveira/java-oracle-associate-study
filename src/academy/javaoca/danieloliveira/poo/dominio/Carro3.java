package academy.javaoca.danieloliveira.poo.dominio;

public class Carro3 {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro3(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public  void imprime(){
        System.out.println("--------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro3.velocidadeLimite);
    }
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro3.velocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }



}
