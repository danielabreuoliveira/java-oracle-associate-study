package academy.javaoca.danieloliveira.fundamentos.condicionais;

public class EstruturaCondicionais {
    static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcoolica");
        }else{
            System.out.println("Não autorizado a comprar bebida alcoolica");
        }
        if (!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcoolica");
        }

    }
}
