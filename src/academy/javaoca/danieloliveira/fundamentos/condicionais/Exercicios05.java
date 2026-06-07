package academy.javaoca.danieloliveira.fundamentos.condicionais;

public class Exercicios05 {
    static void main(String[] args) {
        double num1 =10;
        double num2 = 2;
        char operacao = '/';

        switch (operacao){
            case '+' :
                System.out.println("A soma de " + num1 + " e " + num2 + " é: " + num1+num2);
                break;
            case '-' :
                System.out.println("A subtracao de " + num1 + " e " + num2 + " é: " + (num1-num2));
                break;
            case '*' :
                System.out.println("A multiplicacao de " + num1 + " e " + num2 + " é: " + num1*num2);
                break;
            case '/' :
                if(num2!=0) {
                    System.out.println("A divisao de " + num1 + " e " + num2 + " é: " + (num1/num2));
                }else {
                    System.out.println("o segundo numero não pode ser 0 ");
                }
                break;
                }
    }
}
