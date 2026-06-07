package academy.javaoca.danieloliveira.fundamentos.variaveis;

public class TiposPrimitivos {
    static void main(String[] args) {
        // int,double,char,float,boolean,long,short,byte

        int idade = 10;
        int idadeCasting = (int) 1000000000L;
        long numeroGrande = 1000000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "um grande texto";

        System.out.println("a idade é: " + idade + " anos");
        System.out.println(idadeCasting);
        System.out.println(falso);
    }
}
