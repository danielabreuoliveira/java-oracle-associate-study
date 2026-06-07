package academy.javaoca.danieloliveira.fundamentos.condicionais;

public class Exercicios08 {
    static void main(String[] args) {
        double saldoInicial = 500.00;
        double valorDisponivel;
        String opcaoMenu = "2 - Sacar";

        switch (opcaoMenu){
            case "1 - Ver Saldo":
                System.out.println("Saldo disponivel: " + saldoInicial);
                break;
            case "2 - Sacar":
                double sacar = 200.00;
                if (sacar > saldoInicial) {
                    System.out.println("Saldo insuficiente");
                }else {
                    valorDisponivel = (saldoInicial - sacar);
                    System.out.println("O saque no valor de: R$ " + sacar + " o saldo disponivel agora é de: R$ " + valorDisponivel);
                }
                break;

                }

    }
}
