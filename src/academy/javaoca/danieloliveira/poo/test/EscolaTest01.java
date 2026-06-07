package academy.javaoca.danieloliveira.poo.test;

import academy.javaoca.danieloliveira.poo.dominio.Escola;
import academy.javaoca.danieloliveira.poo.dominio.Professor01;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor01 professor = new Professor01("Kakashi");
        Professor01 professor2 = new Professor01("Jiraya");
        Professor01[] professores = {professor,professor2};
        Escola escola = new Escola("Konoha",professores);

        escola.imprime();
    }
}
