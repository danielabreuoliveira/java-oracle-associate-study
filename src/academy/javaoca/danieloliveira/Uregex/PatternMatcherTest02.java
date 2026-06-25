package academy.javaoca.danieloliveira.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo oq nao for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo em branco \t \n \f \r
        // \w = a-Z A-Z, digitos, _
        // \W = tudo q nao for incluido no /w_
        String regex = "\\W";
        //String texto = "abaaba";
        String texto2 = "j21h_j 23";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group()+ "\n");
        }
    }
}
