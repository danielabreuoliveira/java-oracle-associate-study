package academy.javaoca.danieloliveira.poo.review.teste2;

public class Teste {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(2300);

        System.out.println(contaBancaria.depositar(100));
        System.out.println(contaBancaria.sacar(50));
        System.out.println(contaBancaria.sacar(3500));


    }
}
