package academy.javaoca.danieloliveira.poo.dominio;

public class Anime4 {
    private String nome;
    private static int[] episodios;
    static {
        System.out.println("bloco de inicialização");
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i]+=i;
        }
    }
    public Anime4(String nome) {
        this.nome = nome;
    }

    public Anime4() {
        for(int episodio: Anime4.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}

