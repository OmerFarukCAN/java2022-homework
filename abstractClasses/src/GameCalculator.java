public abstract class GameCalculator {
    // Classes that inherit the GameCalculator class must override the calculation method.
    public abstract void calculate();

    public final void gameOver() {
        System.out.println("Game over");
    }
}
