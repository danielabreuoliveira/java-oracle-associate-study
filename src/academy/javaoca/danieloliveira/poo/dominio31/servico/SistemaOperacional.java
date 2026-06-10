package academy.javaoca.danieloliveira.poo.dominio31.servico;

import academy.javaoca.danieloliveira.poo.dominio31.repositorio.Atualizavel;

public class SistemaOperacional {
    public static String atualizarDispositivo(Atualizavel dispositivo){
        return dispositivo.atualizarSoftware();
    }
}
