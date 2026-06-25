package academy.javaoca.danieloliveira.Uregex;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner scan = new Scanner(texto);
        scan.useDelimiter(",");
        while (scan.hasNext()) {
            if(scan.hasNextInt()){
                int i = scan.nextInt();
                System.out.println("Int " + i);
            }else  if(scan.hasNextBoolean()){
                boolean b = scan.nextBoolean();
                System.out.println("boolean " + b);
            }else {
                System.out.println(scan.next());
            }
        }

    }
}
