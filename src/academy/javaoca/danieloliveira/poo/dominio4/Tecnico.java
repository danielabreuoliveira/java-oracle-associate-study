package academy.javaoca.danieloliveira.poo.dominio4;

public class Tecnico {
    private String nome;
    private String estrategia;
    private Time[] time;

    public void imprime(){
        System.out.println("------------- Dados Tecnico --------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Estrategia: " + this.estrategia);
        if(time !=null){
            for (Time time: time) {
                time.imprime();
            }
        }

    }
    public Tecnico(String nome, String estrategia) {
        this.nome = nome;
        this.estrategia = estrategia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    public Time[] getTime() {
        return time;
    }

    public void setTime(Time[] time) {
        this.time = time;
    }
}
