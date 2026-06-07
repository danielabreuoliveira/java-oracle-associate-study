package academy.javaoca.danieloliveira.poo.dominio4;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Jogador {
    private String nome;
    private int idade;
    private String posicao;
    private int numeroCamisa;
    private Time time;

    public void imprime(){
        System.out.println("--------------- DADOS jOGADOR ----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Posicao: " + this.posicao);
        System.out.println("Numo da camisa: " + this.numeroCamisa);
        System.out.println(" Nome do time - " + time.getNome());
    }
    public Jogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Jogador(String nome, int idade, String posicao, int numeroCamisa) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
