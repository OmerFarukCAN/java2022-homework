public class Main {
    public static void main(String[] args) {
        String message = "Today the weather is good";
        String newMessage = message.substring(0, 2);
        System.out.println(newMessage);

        String city = giveCity();
        System.out.println(city);

        int sum1 = sum(5, 7);
        System.out.println(sum1);

        int sum2 = sum2(2, 5, 6, 4, 12);
        System.out.println(sum2);
        System.out.println(sum2());
    }

    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    //Variable arguments
    public static int sum2(int... sayilar) {
        int sum = 0;
        for (var sayi : sayilar) {
            sum += sayi;
        }
        return sum;
    }

    public static String giveCity() {
        return "Ankara";
    }
}