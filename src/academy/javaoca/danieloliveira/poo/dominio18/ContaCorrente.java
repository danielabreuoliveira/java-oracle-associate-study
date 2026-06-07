package academy.javaoca.danieloliveira.poo.dominio18;

public class ContaCorrente extends Conta{
   /*
    public double depositar(double valor){
        return getSaldo() += valor;
    }
*/
    @Override
    public void imprime() {
        System.out.println("conta conrrente");
        System.out.println("Saldo " + getSaldo());
    }
}
