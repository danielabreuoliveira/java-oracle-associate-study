package academy.javaoca.danieloliveira.poo.testExercicios;

import academy.javaoca.danieloliveira.poo.dominio8.*;

public class Exercicios05 {
    public static void main(String[] args) {
        Produto produto = new Produto("sabao",7.11);
        Pagamento pagamento = new Pagamento("Pix","pago");
        ItemDoPedido itemDoPedido = new ItemDoPedido(produto, 3);

        ItemDoPedido[] itemDoPedido1 = {itemDoPedido};
        Pedido pedido = new Pedido(123,itemDoPedido1,pagamento);
        Pedido pedido2 = new Pedido(124,itemDoPedido1,pagamento);

        Pedido[] pedidosCliente = {pedido,pedido2};
         Cliente cliente = new Cliente("joao","joao@email",pedidosCliente);

         pedido.setCliente(cliente);

         cliente.imprime();

    }
}
