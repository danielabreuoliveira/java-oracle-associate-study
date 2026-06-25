package academy.javaoca.danieloliveira.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo oq nao for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo em branco \t \n \f \r
        // \w = a-Z A-Z, digitos, _
        // \W = tudo q nao for incluido no /w_
        // []
        //String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        //String texto = "abaaba";
        String texto2 = "12 0x 0x 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group()+ "\n");
        }
        int numeroHex = 0x1;
        System.out.println(numeroHex);
    }
}
