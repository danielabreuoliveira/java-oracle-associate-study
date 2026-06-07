package academy.javaoca.danieloliveira.poo.test;

public class Exercicio01 {
    public static void main(String[] args) {
        Exercicio01 exercicios =  new Exercicio01();

        exercicios.somaNumeros(10,20);
        exercicios.subtrairNumeros(10,20);
        exercicios.multNumeros(10,20);
        exercicios.divisaoNumeros(10,20);
        exercicios.verificaParImpar(13);
    }

    public void somaNumeros(int n1, int n2){
        int soma = n1 + n2;
        System.out.println(soma);
    }

    public void subtrairNumeros(int n1, int n2){
        int sub = n1-n2;
        System.out.println(sub);
    }

    public void multNumeros(int n1, int n2){
        int mult = n1*n2;
        System.out.println(mult);
    }

    public void divisaoNumeros(int n1, int n2){
        int div = n1/n2;
        System.out.println(div);
    }

    public void verificaParImpar(int n1){
        if(n1 % 2 == 0){
            System.out.println("primero numero é par: " + n1);
        }else {
            System.out.println("impar");
        }
    }


}
