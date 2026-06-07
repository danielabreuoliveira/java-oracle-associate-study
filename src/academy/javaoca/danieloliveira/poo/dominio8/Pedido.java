package academy.javaoca.danieloliveira.poo.dominio8;

public class Pedido {
    private int id;
    private Cliente cliente;
    private ItemDoPedido[] itensDoPedido;
    private Pagamento pagamento;

    public Pedido(int id, ItemDoPedido[] itensDoPedido, Pagamento pagamento) {
        this.id = id;
        this.itensDoPedido = itensDoPedido;
        this.pagamento = pagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemDoPedido[] getItensDoPedido() {
        return itensDoPedido;
    }

    public void setItensDoPedido(ItemDoPedido[] itensDoPedido) {
        this.itensDoPedido = itensDoPedido;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
