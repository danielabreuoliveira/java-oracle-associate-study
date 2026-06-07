package academy.javaoca.danieloliveira.fundamentos.repeticao;

public class Exercicios03 {
    static void main(String[] args) {
        double valorCarro = 40000;

        for (int parcela = (int) valorCarro; parcela >= 1; parcela--){
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("parcela "+ parcela + " R$ " + valorParcela);
        }

    }
}
