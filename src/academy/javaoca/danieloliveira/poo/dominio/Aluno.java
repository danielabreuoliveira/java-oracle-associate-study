package academy.javaoca.danieloliveira.poo.dominio;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia(){
        double media = (this.nota1 + this.nota2)/2;
        return media;
    }
    public void verificarAprovacao(){
        double media = calcularMedia();
        if(media >= 7){
            System.out.println("Aluno: " + nome + " Aprovado! Com a media: " + media);
        }else {
            System.out.println("Aluno: " + nome + " Reprovado! Com a media: " + media);
        }
    }
}
