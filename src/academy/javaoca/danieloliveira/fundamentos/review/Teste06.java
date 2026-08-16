package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste06 {
    public double calcularTaxa(double valorComida, double taxa){
        return valorComida * taxa;
    }
    public static void main(String[] args) {
        double valorComida = 120;
        Teste06 comida = new Teste06();
        double taxaComida = comida.calcularTaxa(valorComida,0.10);
        double valorTotal = taxaComida + valorComida;
        System.out.println("Valor total da comida é: " + valorTotal);
    }
}
