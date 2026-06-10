package academy.javaoca.danieloliveira.poo.dominio31.servico;

import academy.javaoca.danieloliveira.poo.dominio31.repositorio.Conectavel;

public class Rede {
    public static String conectarDispositivo(Conectavel dispositivo){
       return dispositivo.conectar();
    }
    public static String desconectarDispositivo(Conectavel dispositivo){
       return  dispositivo.desconectar();
    }
}
