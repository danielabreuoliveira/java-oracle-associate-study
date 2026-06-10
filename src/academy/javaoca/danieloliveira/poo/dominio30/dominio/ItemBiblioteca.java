package academy.javaoca.danieloliveira.poo.dominio30.dominio;

public abstract class ItemBiblioteca {
    private String titulo;
    private String codigo;

    public ItemBiblioteca(String titulo, String codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
    }

    public void gerarRelatorio(){
        System.out.println("Relatario: ");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("\n----------------------");
    }
}
