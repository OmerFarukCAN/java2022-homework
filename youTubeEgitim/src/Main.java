public class Main {
    public static void main(String[] args) {
        // primitive and reference types
        int number1 = 10;
        int number2 = 20;
        number1 = number2;
        number2 = 100;
        System.out.println(number1); // ?

        int[] numbers1 = new int[]{1, 2, 3};
        int[] numbers2 = new int[]{10, 20, 30};
        numbers1 = numbers2;
        numbers2[0] = 1000;
        System.out.println(numbers1[0]);

        // class structure
        Customer customer = new IndividualCustomer();
        customer.setId(1);
        customer.setCity("Istanbul");

        Customer customer2 = new Customer(2, "Ankara");

        CustomerManager customerManager = new CustomerManager(customer, new TeacherCreditManager());
        customerManager.add();

        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save(customer);

        creditManager.calculate();
        creditManager.save(customer2);

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(3);
        corporateCustomer.setCity("Eskisehir");
        corporateCustomer.setCompanyName("Abcd");
        corporateCustomer.setTaxNumber("124124124");

        CustomerManager customerManager1 = new CustomerManager(corporateCustomer, new MilitaryCreditManager());
        customerManager1.add();
        customerManager1.giveCredit();
    }
}

