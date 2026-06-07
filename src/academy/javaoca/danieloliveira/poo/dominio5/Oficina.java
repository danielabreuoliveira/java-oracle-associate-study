package academy.javaoca.danieloliveira.poo.dominio5;

public class Oficina {
    private String nome;
    private String endereco;
    private Mecanico[] mecanicos;
    private Carro[] carros;

    public void imprime(){
        System.out.println("/*/*/*/*/ OFICINA /*//*/*/*/*/ ");
        System.out.println(this.nome);
        System.out.println(this.endereco);
        if(mecanicos!=null) {
            for (Mecanico mecanico : mecanicos) {
                mecanico.imprime();
            }
        }
        if(carros!=null){
            for (Carro carro : carros) {
                System.out.println(carro);
            }
        }
    }
    public Oficina(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Mecanico[] getMecanicos() {
        return mecanicos;
    }

    public void setMecanicos(Mecanico[] mecanicos) {
        this.mecanicos = mecanicos;
    }

    public Carro[] getCarros() {
        return carros;
    }

    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }
}
