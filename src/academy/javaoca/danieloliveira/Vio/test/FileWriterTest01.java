package academy.javaoca.danieloliveira.Vio.test;
// FIle
// Filewriter
// FileReader
// BufferedWriter
// BufferedReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try( FileWriter fw = new FileWriter(file, true)) {
            fw.write("Hello World, é o basico para escrever\n continue na segunda linha");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
