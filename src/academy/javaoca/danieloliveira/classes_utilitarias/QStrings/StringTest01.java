package academy.javaoca.danieloliveira.classes_utilitarias.QStrings;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Daniel"; // String constant pool
        String nome2= "Daniel";
        nome = nome.concat("Oliveira");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String( "Daniel");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
