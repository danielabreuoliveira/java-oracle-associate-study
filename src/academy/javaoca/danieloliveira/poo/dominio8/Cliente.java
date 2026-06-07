package academy.javaoca.danieloliveira.poo.dominio8;

public class Cliente {
    private String nome;
    private String email;
    private Pedido[] pedidos;

    public void imprime(){
        System.out.println("-----Cliente Dados:");
        System.out.println("Nome:" + this.nome);
        System.out.println("Email:" + this.email);
        if(pedidos!= null){
            for (Pedido pedido : pedidos) {
                System.out.println("---Pedidos--");
                System.out.println("ID: " + pedido.getId());
                //System.out.println("Nome cliente: " +pedido.getCliente().getNome());
                //System.out.println("Email do cliente: " +pedido.getCliente().getEmail());
                for (ItemDoPedido itemDoPedido : pedido.getItensDoPedido()) {
                    System.out.println("Nome produto: " +itemDoPedido.getProduto().getNome());
                    System.out.println("Preco produto: " +itemDoPedido.getProduto().getPreco());
                    System.out.println("Quantidade: " +itemDoPedido.getQuantidade());
                }
                System.out.println("Tipo: " + pedido.getPagamento().getTipo());
                System.out.println("Status: " + pedido.getPagamento().getStatus());
            }
        }else {
            System.out.println("Pedido nao efetuado!");
        }
    }
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String nome, String email, Pedido[] pedidos) {
        this.nome = nome;
        this.email = email;
        this.pedidos = pedidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }
}
