package academy.javaoca.danieloliveira.poo.dominio29.dominio;

public abstract class Veiculo {
    private String modelo;
    private int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String gerarRelatorio(){
        return "---------------------------" +
                "\n"+
                "\nModelo: " + this.modelo +
                "\nAno: " + this.ano +
                "\nTipo do veiculo: "+
                "\n";
    };
}
