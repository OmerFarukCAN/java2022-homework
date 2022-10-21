public class CustomerManager {
    private final Customer customer;
    private final CreditService creditService;

    public CustomerManager(Customer customer, CreditService creditService) {
        this.customer = customer;
        this.creditService = creditService;
    }

    public void add() {
        System.out.println("New customer added: " + customer.getId());
    }

    public void giveCredit() {
        creditService.calculate();
    }
}
