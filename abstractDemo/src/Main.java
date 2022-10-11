public class Main {
    public static void main(String[] args) {
        // way 1
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new OracleDatabaseManager();
        customerManager.getCustomers();

        // way 2
        CustomerManager customerManager1 = new CustomerManager(new SqlServerDatabaseManager());
        customerManager1.getCustomers();

        CustomerManager customerManager2 = new CustomerManager(new MySqlDatabaseManager());
        customerManager2.getCustomers();
    }
}