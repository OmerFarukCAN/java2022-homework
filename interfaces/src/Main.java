public class Main {
    public static void main(String[] args) {
        /*
         interfaces can never be new
         CustomerDao customerDao = new CustomerDao();
         CustomerDao customerDao = new OracleCustomerDao();
         customerDao.add();
        */

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDao());
        customerManager.add();

    }
}

