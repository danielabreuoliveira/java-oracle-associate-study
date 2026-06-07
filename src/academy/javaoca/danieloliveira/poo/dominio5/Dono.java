package academy.javaoca.danieloliveira.poo.dominio5;

public class Dono {
    private String nome;
    private int telefone;
    Carro[] carros;

    public void imprime(){
        System.out.println("/*/*/*/*/ Dono /*//*/*/*/*/ ");
        System.out.println(this.nome);
        System.out.println(this.telefone);
        if(carros!=null){
            for (Carro carro : carros) {
                carro.imprime();
            }
        }
    }
    public Dono(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Carro[] getCarros() {
        return carros;
    }

    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }
}
