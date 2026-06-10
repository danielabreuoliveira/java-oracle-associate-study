package academy.javaoca.danieloliveira.poo.dominio31.dominio;

import academy.javaoca.danieloliveira.poo.dominio31.repositorio.Atualizavel;
import academy.javaoca.danieloliveira.poo.dominio31.repositorio.Conectavel;

public class Smartphone extends Dispositivo implements Atualizavel, Conectavel {
    public Smartphone(String nome, String fabricante) {
        super(nome, fabricante);
    }

    @Override
    public String conectar() {
        return "Smartphone conectado";
    }

    @Override
    public String desconectar() {
        return "Smartphone desconectado";
    }

    @Override
    public String atualizarSoftware() {
        return "Smartphone atualizado";
    }
}
