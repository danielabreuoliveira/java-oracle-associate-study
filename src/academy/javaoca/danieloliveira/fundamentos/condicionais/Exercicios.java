package academy.javaoca.danieloliveira.fundamentos.condicionais;
/*

Faixa 1: Até € 38.883 \(\rightarrow \) 35,75% (uma pequena redução em relação aos 35,82% de 2025).
Faixa 2: De € 38.883 até € 79.137 \(\rightarrow \) 37,56%.
Faixa 3: Acima de € 79.137 \(\rightarrow \) 49,50%.
 */

public class Exercicios {
    static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraTaxa = 35.75/100;
        double segundaTaxa = 37.56/100;
        double terceiraTaxa = 49.50/100;
        double valorImposto;

        if (salarioAnual <= 38883){
            valorImposto = salarioAnual*primeiraTaxa;
        } else if (salarioAnual > 38883 && salarioAnual < 79137) {
            valorImposto = salarioAnual*segundaTaxa;
        } else{
            valorImposto = salarioAnual*terceiraTaxa;
        }
        System.out.println(valorImposto);
    }
}
