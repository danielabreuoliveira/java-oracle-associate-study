package academy.javaoca.danieloliveira.Uregex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo oq nao for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo em branco \t \n \f \r
        // \w = a-Z A-Z, digitos, _
        // \W = tudo q nao for incluido no /w_
        // []
        // ? zero ou uma ocorrencia
        // * zero ou mais
        // + uma ou mais
        //{n,m} de n ate m
        // ()
        // | o(v|c)o ovo | oco
        // $
        //String regex = "[a-zA-C]";
        // . 1.3 = 123,133,1@3, 1A3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        //String texto = "abaaba";
        String texto = "naruto@hotmail.com, 123jotaro@gmail.com, #@!eren@email.com.br, teste@gmail.com.br, sakura@mail";
        System.out.println("email valido");
        System.out.println("eren@email.com.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
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
