package academy.javaoca.danieloliveira.poo.dominio;

public class ImpressoraEstudante {
    public  void imprimeEstudante (Estudante estudante){
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
