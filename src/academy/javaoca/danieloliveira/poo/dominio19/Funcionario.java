package academy.javaoca.danieloliveira.poo.dominio19;

public class Funcionario {
    private String nome;
    private NivelAcesso nivelAcesso;

    public Funcionario(String nome, NivelAcesso nivelAcesso) {
        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public void visualizar() {
        System.out.println("Nome: " + nome);
        if (nivelAcesso == nivelAcesso.ADMIN) {
            System.out.println("Nivel Acesso: " + NivelAcesso.ADMIN + "\nBEM VINDO AO SISTEMA ADMIN! ");
            System.out.println("-----------------------------");
        }
        if (nivelAcesso == nivelAcesso.GERENTE) {
            System.out.println("Nivel Acesso: " + NivelAcesso.GERENTE + "\nBEM VINDO AO SISTEMA GERENTE! ") ;
            System.out.println("-----------------------------");
        }
        if (nivelAcesso == nivelAcesso.USUARIO) {
            System.out.println("Nivel Acesso: " + NivelAcesso.USUARIO + "\nBEM VINDO AO SISTEMA USUARIO ") ;
            System.out.println("-----------------------------");
        }
    }
}
