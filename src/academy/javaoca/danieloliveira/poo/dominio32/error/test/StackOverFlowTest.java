package academy.javaoca.danieloliveira.poo.dominio32.error.test;

public class StackOverFlowTest {
    public static void main(String[] args) {
        recursividade();
    }
    public  static  void recursividade(){
        recursividade();
    }
}
