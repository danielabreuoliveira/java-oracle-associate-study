package academy.javaoca.danieloliveira.poo.dominio31.dominio;

import academy.javaoca.danieloliveira.poo.dominio31.repositorio.Conectavel;

public class Impressora extends Dispositivo implements Conectavel {
    public Impressora(String nome, String fabricante) {
        super(nome, fabricante);
    }
    @Override
    public String conectar() {
        return "Impressora conectada";
    }

    @Override
    public String desconectar() {
        return "Impressora desconectada";
    }

}
