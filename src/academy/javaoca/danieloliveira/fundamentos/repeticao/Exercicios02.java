package academy.javaoca.danieloliveira.fundamentos.repeticao;

public class Exercicios02 {
    // dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
    // condicao o valorParcela >= 1000
    static void main(String[] args) {
        double valorCarro = 40000;

        for (int parcela = 1; parcela <= valorCarro; parcela++){
           double valorParcela = valorCarro / parcela;

            if(valorParcela < 1000) {
                break;
            }
            System.out.println("parcela "+ parcela + " R$ " + valorParcela);
        }

    }
}
