package academy.javaoca.danieloliveira.poo.dominio31.test;

import academy.javaoca.danieloliveira.poo.dominio31.dominio.Dispositivo;
import academy.javaoca.danieloliveira.poo.dominio31.dominio.Impressora;
import academy.javaoca.danieloliveira.poo.dominio31.dominio.Notebook;
import academy.javaoca.danieloliveira.poo.dominio31.dominio.Smartphone;
import academy.javaoca.danieloliveira.poo.dominio31.repositorio.Atualizavel;
import academy.javaoca.danieloliveira.poo.dominio31.repositorio.Conectavel;
import academy.javaoca.danieloliveira.poo.dominio31.servico.Rede;
import academy.javaoca.danieloliveira.poo.dominio31.servico.SistemaOperacional;

public class DispositivoTest {
    static void main(String[] args) {
        Notebook notebook1 = new Notebook("Samsung", "Samsung");
        Notebook notebook2 = new Notebook("HP", "HP");

        Smartphone smartphone1 = new Smartphone( "samsung s20", "samsung");
        Smartphone smartphone2 = new Smartphone("Iphone 20", "apple");

        Impressora impressora1 = new Impressora("hp 22", "hp");
        Impressora impressora2 = new Impressora("dell", "dell");

        Dispositivo[] dispositivos ={
                notebook1,notebook2,
                smartphone1,smartphone2,
                impressora1,impressora2
        };

        for (Dispositivo dispositivo : dispositivos) {
            dispositivo.gerarRelatorio();
        }

        Conectavel[] conectavels = {
                notebook1,notebook2,
                smartphone1,smartphone2,
                impressora1,impressora2
        };

        for (Conectavel conectavel : conectavels) {
            System.out.println("\n");
            System.out.println(Rede.conectarDispositivo(conectavel));
            System.out.println(Rede.desconectarDispositivo(conectavel));
        }

        Atualizavel[] atualizavels = {
                notebook1,notebook2,
                smartphone1,smartphone2,
        };

        for (Atualizavel atualizavel : atualizavels) {
            System.out.println("\n");
            System.out.println(SistemaOperacional.atualizarDispositivo(atualizavel));
        }

    }
}
