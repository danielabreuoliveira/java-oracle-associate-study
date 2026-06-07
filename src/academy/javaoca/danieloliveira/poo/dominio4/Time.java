package academy.javaoca.danieloliveira.poo.dominio4;

public class Time {
    private String nome;
    private String cidade;
    private Jogador[] jogadores;
    private Tecnico tecnico;

    public void imprime(){
        System.out.println("------------- Dados do Time-------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cidade: " + this.cidade);
        if(jogadores != null){
            for (Jogador jogador : jogadores) {
                jogador.imprime();
            }
        }

        System.out.println("Nome do tecnico - " + tecnico.getNome());
        int contadorJogadores = 0;
        for (Jogador jogador : jogadores) {
            contadorJogadores++;
        }
        System.out.println("--------------------------");
        System.out.println("Numero de jogadores: " + contadorJogadores);
    }
    public Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
}
