package academy.javaoca.danieloliveira.fundamentos.pacotes.pedido;

import academy.javaoca.danieloliveira.fundamentos.pacotes.cliente.Cliente;

public class Pedido {

    public void exibirSaldo(Cliente cliente){
        System.out.println(cliente.getSaldo());
        System.out.println(cliente.getTitular());
    }
}
