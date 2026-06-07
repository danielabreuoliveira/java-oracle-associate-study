package academy.javaoca.danieloliveira.poo.dominio5;

public class Carro {
    private String modelo;
    private String placa;
    private int ano;
    private Dono dono;

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", ano=" + ano +
                '}';
    }
    public void imprime(){
        System.out.println("/*/*/*/*/ CARRO /*//*/*/*/*/ ");
        System.out.println(this.modelo);
        System.out.println(this.placa);
        System.out.println(this.ano);
        System.out.println("Nome dono: " + dono.getNome());
    }
    public Carro(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }
}
