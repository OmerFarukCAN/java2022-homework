public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sum = dortIslem.sum(2, 5);
        int subtract = dortIslem.subtract(12, 7);
        int multiply = dortIslem.multiply(4, 3);
        int divide = dortIslem.divide(13, 5);

        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
    }
}