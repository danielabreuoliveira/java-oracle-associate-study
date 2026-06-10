package academy.javaoca.danieloliveira.poo.dominio31.dominio;

import academy.javaoca.danieloliveira.poo.dominio31.repositorio.Atualizavel;
import academy.javaoca.danieloliveira.poo.dominio31.repositorio.Conectavel;

public class Notebook extends Dispositivo implements Atualizavel, Conectavel {
    public Notebook(String nome, String fabricante) {
        super(nome, fabricante);
    }

    @Override
    public String conectar() {
        return "Notebook conectado";
    }

    @Override
    public String desconectar() {
        return "Notebook desconectado";
    }

    @Override
    public String atualizarSoftware() {
        return "Notebook atualizado";
    }
}
