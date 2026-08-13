package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste01 {
    public static void main(String[] args) {
        double imc = 27.5;

        if(imc < 18.5){
            System.out.println("abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("sobrepeso");
        }else {
            System.out.println("obeso");
        }
    }
}
