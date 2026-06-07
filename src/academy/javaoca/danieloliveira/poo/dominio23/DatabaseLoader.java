package academy.javaoca.danieloliveira.poo.dominio23;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados de um banco de dados");
    }
    public static void retrieveDataSize(){
        System.out.println("Dentro da classe databaseloader");
    }
}
