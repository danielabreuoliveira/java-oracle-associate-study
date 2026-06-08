package academy.javaoca.danieloliveira.poo.dominio27.test;

import academy.javaoca.danieloliveira.poo.dominio27.dominio.Administrador;
import academy.javaoca.danieloliveira.poo.dominio27.dominio.Cliente;
import academy.javaoca.danieloliveira.poo.dominio27.dominio.Gerente;
import academy.javaoca.danieloliveira.poo.dominio27.repositorio.Autenticavel;
import academy.javaoca.danieloliveira.poo.dominio27.repositorio.Imprimivel;
import academy.javaoca.danieloliveira.poo.dominio27.servicos.SistemaLogin;

public class SistemaLoginTest {
    public static void main(String[] args) {

        Autenticavel[] usuarios = {
                new Gerente("Joana","2123123123","123123"),
                new Gerente("Carlos", "12312312313", "1231234"),
                new Cliente("Joana", "12312312313", "12345"),
                new Cliente("Joaquin", "12312312313","12346"),
                new Administrador("Daniel", "12312312313","12324"),
                new Administrador("Maria", "12312232312313", "12324"),
        };
        for (Autenticavel usuario : usuarios) {
            SistemaLogin.realizarLogin(usuario, "12324");
        }
        Imprimivel[] imprimivels =  {
                new Gerente("Joana","2123123123","123123"),
                new Gerente("Carlos", "12312312313", "1231234"),
                new Cliente("Joana", "12312312313", "12345"),
                new Cliente("Joaquin", "12312312313","12346"),
                new Administrador("Daniel", "12312312313","12324"),
                new Administrador("Maria", "12312232312313", "12324"),
        };
        for (Imprimivel imprimivel : imprimivels) {
            System.out.println(imprimivel.gerarRelatorio());
        }

    }
}
