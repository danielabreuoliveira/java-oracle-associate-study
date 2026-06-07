package academy.javaoca.danieloliveira.poo.testExercicios;

import academy.javaoca.danieloliveira.poo.dominio23.DataLoader;
import academy.javaoca.danieloliveira.poo.dominio23.DatabaseLoader;
import academy.javaoca.danieloliveira.poo.dominio23.FileLoader;

public class Dominio23Test {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveDataSize();
        DatabaseLoader.retrieveDataSize();
    }
}
