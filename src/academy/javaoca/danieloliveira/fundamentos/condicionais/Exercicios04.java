package academy.javaoca.danieloliveira.fundamentos.condicionais;

public class Exercicios04 {
    static void main(String[] args) {
        float nota = 2F;

        if(nota>= 7){
            System.out.println("Aprovado");
        } else if (nota>=5 && nota<= 6.9) {
            System.out.println("Recuperacao");
        }else {
            System.out.println("Reprovado");
        }

    }
}
