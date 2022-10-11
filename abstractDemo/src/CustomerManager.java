public class CustomerManager {
    BaseDatabaseManager baseDatabaseManager;

    public CustomerManager() {

    }

    public CustomerManager(BaseDatabaseManager baseDatabaseManager) {
        this.baseDatabaseManager = baseDatabaseManager;
    }

    public void getCustomers() {
        this.baseDatabaseManager.getData();
    }
}
