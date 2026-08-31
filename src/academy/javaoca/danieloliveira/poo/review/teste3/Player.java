package academy.javaoca.danieloliveira.poo.review.teste3;

public class Player {

    private int posicaoX;
    private int posicaoY;
    private int vida;
    private double velocidade;

    public void mover(int dx, int dy){
      posicaoX += dx;
      posicaoY += dy;
    }

    public void atacar(){
        System.out.println("Atacar!!!");
    }
}
