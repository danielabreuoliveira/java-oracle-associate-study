    package academy.javaoca.danieloliveira.fundamentos.review;

    import java.util.Scanner;

    public class Teste28 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numero = 0;
            int quantidadeNumeros = 0;

            do{
                System.out.println("Digite um numero: ");
                numero = scanner.nextInt();
                    quantidadeNumeros++;

            }while (numero!=0);

            System.out.println("\nQuantidade de numeros digitados: " + quantidadeNumeros);
            scanner.close();
        }
    }
