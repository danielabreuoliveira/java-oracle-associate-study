package academy.javaoca.danieloliveira.poo.testExercicios;

import academy.javaoca.danieloliveira.poo.dominio12.Cliente;
import academy.javaoca.danieloliveira.poo.dominio13.TipoCliente;
import academy.javaoca.danieloliveira.poo.dominio13.TipoPagamento;

public class Dominio12Test {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Joao",TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Joao",TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipocliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipocliente2);

    }
}
