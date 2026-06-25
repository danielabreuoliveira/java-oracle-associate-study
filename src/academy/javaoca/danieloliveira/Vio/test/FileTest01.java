package academy.javaoca.danieloliveira.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File f = new File("file.txt");
        try {
            //boolean isDeleted = f.delete();


            boolean isCreated = f.createNewFile();
            System.out.println("Created " + isCreated);
            System.out.println("path" + f.getPath()) ;
            System.out.println("absolute path" + f.getAbsolutePath()) ;
            System.out.println("is  diretory  " + f.isDirectory()) ;
            System.out.println("is  file  " + f.isFile()) ;
            System.out.println("is hidden  " + f.isHidden()) ;
            System.out.println("Last modified " + new Date(f.lastModified())) ;
            boolean exists = f.exists();
            if(exists){
                System.out.println("Deleted " + f.delete());
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
