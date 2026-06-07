package academy.javaoca.danieloliveira.fundamentos.condicionais;

public class Exercicios10 {
    static void main(String[] args) {
        String perfilCliente = "2 - Autonomo";
        double rendaMensal = 10000.00;

        switch (perfilCliente){
            case "1 - Assalariado":
                if(rendaMensal > 3000){
                System.out.println("Emprestimo Aprovado");
            }else{
                    System.out.println("Emprestimo negado!");
                }
                break;
            case "2 - Autonomo":
                if (rendaMensal > 5000){
                    System.out.println("Emprestimo Aprovado");
                }else {
                    System.out.println("Emprestimo Negado!");
                }
                break;
            case "3 - Estudante":
                System.out.println("Indisponivel para esta categoria");
            break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
