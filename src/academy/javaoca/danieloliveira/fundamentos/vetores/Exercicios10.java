package academy.javaoca.danieloliveira.fundamentos.vetores;

public class Exercicios10 {
    static void main(String[] args) {
        int[][] arrayPar = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < arrayPar.length; i++) {
            for (int j = 0; j < arrayPar[i].length; j++) {
                  if(arrayPar[i][j]%2 ==0){
                      System.out.println("O número par é: " + arrayPar[i][j]);
                  }
            }
        }
        for (int[] parLinha: arrayPar){
            for (int parColuna: parLinha){
                if(parColuna % 2 == 0){
                    System.out.println("O número par: " + parColuna);
                }
            }
        }
    }
}
