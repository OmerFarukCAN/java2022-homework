public class CustomerManager {
    private final CustomerDao customerDao;

    public CustomerManager(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void add() {
        // business codes
        customerDao.add();
    }
}
