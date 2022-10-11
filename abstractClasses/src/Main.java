public class Main {
    public static void main(String[] args) {
        KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
        kidsGameCalculator.calculate();
        kidsGameCalculator.gameOver();

        // abstract classes can never be new
        // GameCalculator gameCalculator = new GameCalculator();

        GameCalculator gameCalculator = new WomanGameCalculator();
    }
}