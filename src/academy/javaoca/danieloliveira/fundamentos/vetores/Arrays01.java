package academy.javaoca.danieloliveira.fundamentos.vetores;

public class Arrays01 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Èren";
        nomes[2] = "Naruto";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
