package academy.javaoca.danieloliveira.fundamentos.condicionais;

public class Exercicios07 {
    static void main(String[] args) {
        double salario = 4001;
        double imposto;
        double salarioLiquido;

        if(salario <=2000){
            System.out.println("isento de imposto");
        } else if (salario>2000 && salario<=4000) {
            imposto = salario * 0.10;
            salarioLiquido = salario - imposto;
            System.out.println("salario de: " + salario + " com 10% de imposto é: " + imposto + " O salario liquido fica: " + salarioLiquido);
        } else {
            imposto = salario * 0.20;
            salarioLiquido = salario - imposto;
            System.out.println("salario de: " + salario + " com 20% de imposto é: " + imposto + " O salario liquido fica: " + salarioLiquido);
        }
    }
}
