package academy.javaoca.danieloliveira.poo.dominio34.servico;

import academy.javaoca.danieloliveira.poo.dominio34.dominio.*;

public class FolhaDePagamento {
    public static void imprimeFuncionario(Funcionario funcionario) {
        System.out.println();
        System.out.println("Nome: " + funcionario.getNome());
        if(funcionario instanceof Gerente) {
            System.out.println("Cargo: GERENTE");
        }
        if (funcionario instanceof Desenvolvedor){
            System.out.println("Cargo: Desenvolvedor");
        }
        if (funcionario instanceof Estagiario){
            System.out.println("Cargo: Estagiario");
        }
        System.out.println("Forma de pagamento: " + funcionario.getFormaDePagamento());
        System.out.println("Pagamento Final: " + funcionario.calcularPagamento());
    }

    public static void totalPagoFuncionario(Funcionario[] funcionarios) {
        double totalPago = 0;
        for (Funcionario funcionario : funcionarios) {
            totalPago = totalPago + funcionario.calcularPagamento();
        }
        System.out.println();
        System.out.println("Total pago pela empresa: " + totalPago);
    }

    public static void totalPagemntosFuncionario(Funcionario[] funcionarios) {
        int totalPix = 0;
        int totalBoleto = 0;
        int totalCartao = 0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getFormaDePagamento() == FormaDePagamento.PIX) {
                totalPix++;
            }
            if (funcionario.getFormaDePagamento() == FormaDePagamento.BOLETO) {
                totalBoleto++;
            }
            if (funcionario.getFormaDePagamento() == FormaDePagamento.CARTAO) {
                totalCartao++;
            }
        }
        System.out.println();
        System.out.println("Total de Funcionarios de pagamento por pix: " + totalPix);
        System.out.println("Total de Funcionarios de pagamento por boleto: " + totalBoleto);
        System.out.println("Total de Funcionarios de pagamento por cartao: " + totalCartao);
    }

    public static void contarPorFuncaoFuncionarios(Funcionario[] funcionarios) {
        int contarFuncaoGerente = 0;
        int contarFuncaoDesenvolvedor = 0;
        int contarFuncaoEstagiario = 0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Gerente) {
                contarFuncaoGerente++;
            }
            if (funcionario instanceof Desenvolvedor) {
                contarFuncaoDesenvolvedor++;
            }
            if (funcionario instanceof Estagiario) {
                contarFuncaoEstagiario++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de Gerentes: " + contarFuncaoGerente);
        System.out.println("Quantidade de Desenvolvedor: " + contarFuncaoDesenvolvedor);
        System.out.println("Quantidade de Estagiarios: " + contarFuncaoEstagiario);
    }
}
