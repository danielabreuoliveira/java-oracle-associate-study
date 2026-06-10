package academy.javaoca.danieloliveira.poo.dominio31.dominio;

public abstract class Dispositivo {
    private String nome;
    private String fabricante;

    public Dispositivo(String nome, String fabricante) {
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public void gerarRelatorio(){
        System.out.println("\n------------Relatorio dispositivo--------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Fabricante: " + this.fabricante);
    }
}
