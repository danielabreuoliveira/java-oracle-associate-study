package academy.javaoca.danieloliveira.fundamentos.review;

public class Teste05 {
    public double calculoHoraExtra(double horasExtras, double valorHoraExtra){
        return valorHoraExtra * horasExtras;
    }
    public static void main(String[] args) {
        double salario = 3500;
        Teste05 calculo = new Teste05();
        double resultado = calculo.calculoHoraExtra(10,25);
        double salarioBruto = resultado + salario;
        System.out.println(salarioBruto);
    }
}
