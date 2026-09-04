package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste102 {

        public static void main(String[] args) {
            int[] numeros = {33,1,1,2,2,3,3};

            for (int i = 0; i < numeros.length; i++) {
                if(i==0||numeros[i]!=numeros[i-1]){
                    System.out.print(numeros[i] + " ");
                }
            }
        }
    }

