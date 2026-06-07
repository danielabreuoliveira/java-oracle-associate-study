package academy.javaoca.danieloliveira.poo.dominio21;

public enum Cargo {
    JUNIOR(5), PLENO(10), SENIOR(20);

    private double bonus;
    Cargo(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
