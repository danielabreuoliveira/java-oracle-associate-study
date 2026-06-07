package academy.javaoca.danieloliveira.poo.dominio12;

import academy.javaoca.danieloliveira.poo.dominio13.TipoCliente;
import academy.javaoca.danieloliveira.poo.dominio13.TipoPagamento;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteINT=" + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public Cliente(String nome, TipoCliente tipoCliente,TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente gettIpoCliente() {
        return tipoCliente;
    }

    public void settIpoCliente(TipoCliente tIpoCliente) {
        this.tipoCliente = tIpoCliente;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
