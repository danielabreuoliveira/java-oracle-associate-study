package academy.javaoca.danieloliveira.poo.dominio;

public class Anime3 {
    private String nome;
    private int[] episodios;
    {
        System.out.println("bloco de inicialização");
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i]+=i;
        }
    }
    public Anime3(String nome) {
        this.nome = nome;
    }

    public Anime3() {
        for(int episodio: this.episodios){
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

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
