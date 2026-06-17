package academy.javaoca.danieloliveira.classes_utilitarias.QStrings;

public class StringBuilderTest01 {
   public static void main(String[] args) {
        String nome = "Daniel de Abreu";
        nome.concat(" Oliveira");
        nome.substring(0,3);
       System.out.println(nome);

       StringBuilder sb = new StringBuilder("Daniel de Abreu");
       sb.append(" Oliveira").append(" Dev - jr");
       sb.substring(0,2);
       sb.reverse();
       sb.reverse();
       sb.delete(0,3);
       System.out.println(sb);
    }
}
