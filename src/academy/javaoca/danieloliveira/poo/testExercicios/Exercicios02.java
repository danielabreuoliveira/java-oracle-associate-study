package academy.javaoca.danieloliveira.poo.testExercicios;

import academy.javaoca.danieloliveira.poo.dominio4.Jogador;
import academy.javaoca.danieloliveira.poo.dominio4.Tecnico;
import academy.javaoca.danieloliveira.poo.dominio4.Time;

public class Exercicios02 {
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico("Renato", "Ofensiva");
        Tecnico tecnico2 = new Tecnico("Leonardo jardim", "Ofensiva");

        Time[] times = new Time[2];

        times[0] = new Time("Vasco da gama", "Rio de janeiro");
        times[1] = new Time("Flamengo", "Rio de janeiro");

        Jogador[] jogadoresDovasco = new Jogador[1];

        jogadoresDovasco[0] = new Jogador("Andres gomes",27,"Atacante",11);

        Jogador[] jogadoresDoflamengo = new Jogador[1];

        jogadoresDoflamengo[0] = new Jogador("Arracaeta", 34,"Atacante",10 );

        jogadoresDovasco[0].setTime(times[0]);
        jogadoresDoflamengo[0].setTime(times[1]);

        times[0].setJogadores(jogadoresDovasco);
        times[1].setJogadores(jogadoresDoflamengo);

        times[0].setTecnico(tecnico);
        times[1].setTecnico(tecnico2);

        tecnico.setTime(times);
        tecnico2.setTime(times);
/*
        tecnico.imprime();
        tecnico2.imprime();
*/
        times[0].imprime();
        times[1].imprime();
    }

}
