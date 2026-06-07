package academy.javaoca.danieloliveira.fundamentos.condicionais;

public class Exercicios06 {
    static void main(String[] args) {
        int lado1 = 10;
        int lado2 = 11;
        int lado3 = 13;

        if((lado1+lado2)>lado3){
            System.out.println("È um tringulo");
            if(lado1==lado2 && lado2==lado3 && lado1==lado3){
                System.out.println("È um tringulo equilatero");
            } else if (lado1==lado2 || lado2==lado3 || lado3==lado1) {
                System.out.println("È um triangulo Isósceles");
            }else {
                System.out.println("È um triangulo Escaleno");
            }
        } else {
            System.out.println("Não é um triangulo");
        }
    }
}
