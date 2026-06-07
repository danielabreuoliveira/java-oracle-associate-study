package academy.javaoca.danieloliveira.fundamentos.condicionais;

public class Exercicios01 {
    static void main(String[] args) {

        byte dia = 2;

        switch (dia){
            case 1:
                System.out.println("Domingo");
            break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("opção invalida");
        }
/*
        // Nova sintaxe do Java (Arrow Switch) - Não precisa de 'break'!
        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sabado");
            default -> System.out.println("opção invalida");
        }
 */
    }
}
