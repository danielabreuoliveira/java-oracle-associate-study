package academy.javaoca.danieloliveira.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try( FileWriter fw = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fw)) {
            br.write("Hello World, é o basico para escrever\n continue na segunda linha");
            br.newLine();
            br.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
