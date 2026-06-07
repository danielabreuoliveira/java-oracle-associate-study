package academy.javaoca.danieloliveira.fundamentos.operadores;

public class Operadores {
    static void main(String[] args) {

        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01*numero02;

        System.out.println(numero01-numero02);
        System.out.println(resultado);

        // %
        int resto = 20%2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualaVinte = 10 == 20;
        boolean isDezIgualaDez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualaVinte);
        System.out.println(isDezIgualaDez);
        System.out.println(isDezDiferenteDeDez);

        // && (AND) || (OR) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(" isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);

        // = += -= /= %= *=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        //++ --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;

        int contador2 = 0;

        System.out.println(contador);

    }
}
