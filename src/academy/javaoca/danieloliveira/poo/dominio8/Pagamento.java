package academy.javaoca.danieloliveira.poo.dominio8;

public class Pagamento {
    private String tipo;
    private String status;

    public Pagamento(String tipo, String status) {
        this.tipo = tipo;
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
