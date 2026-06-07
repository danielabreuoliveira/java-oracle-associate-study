package academy.javaoca.danieloliveira.poo.dominio5;

public class Mecanico {
    private String nome;
    private String especialidade;
    private Carro[] carrosConsertados;

    public void imprime() {
        System.out.println("/*/*/*/*/ MECANICO /*//*/*/*/*/ ");
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        if (carrosConsertados != null) {
            for (Carro carrosConsertado : carrosConsertados) {
                carrosConsertado.imprime();
            }
        }
    }

    public Mecanico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Carro[] getCarrosConsertados() {
        return carrosConsertados;
    }

    public void setCarrosConsertados(Carro[] carrosConsertados) {
        this.carrosConsertados = carrosConsertados;
    }
}
