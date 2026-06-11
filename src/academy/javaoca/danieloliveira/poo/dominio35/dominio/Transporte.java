package academy.javaoca.danieloliveira.poo.dominio35.dominio;

public abstract class Transporte {
    private String modelo;
    private int capacidadePassageiros;
    TipoCombustivel tipoCombustivel;

    public Transporte(String modelo, int capacidadePassageiros, TipoCombustivel tipoCombustivel) {
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
