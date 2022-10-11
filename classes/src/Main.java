public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager1 = new CustomerManager();
        customerManager1.add();
        customerManager1.remove();
        customerManager1.update();

        CustomerManager customerManager2;
        customerManager2 = customerManager1;
        customerManager2.add();

        // bad declare instance
        CustomerManager customerManager3 = new CustomerManager(); // 101 address
        CustomerManager customerManager4 = new CustomerManager(); // 102 address

        customerManager3 = customerManager4; // customerManager 3 address is 102, Garbage Collector will delete 101
        customerManager3.add();
        customerManager4.add();

        // value - stack
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        // reference - heap
        int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{10, 20, 30};
        sayilar2 = sayilar1;
        sayilar1[0] = 100;
        System.out.println(sayilar2[0]);

    }
}