package academy.javaoca.danieloliveira.fundamentos.vetores;

public class Exercicios08 {
    public static void main(String[] args) {
        int[][] matrizMult = {{1,2,3},{1,2,3},{1,2,3}};

        System.out.println("---------Usando FOR --------------");
        for (int i = 0; i < matrizMult.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrizMult[i].length; j++) {
                System.out.print(" " + matrizMult[i][j]);

            }

        }
        System.out.println();
        System.out.println("---------Usando FOR EACH --------------");
        for(int[] arrayMult: matrizMult){
            System.out.println("");
            for(int num: arrayMult){
                System.out.print(" " + num);
            }
        }
    }
}
