package academy.javaoca.danieloliveira.fundamentos.condicionais;

public class EstruturaCondicionais02 {
    static void main(String[] args) {
            double salario = 3000;
            String mensagemDoar = "Vou doar 500 reais para mim";
            String mensagemNaoDoar = "Ainda nao tenho salario";
            //(condicao) ? verdadeiro : falso
            String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
