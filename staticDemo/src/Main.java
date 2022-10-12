public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.id = 1;
        product.name = "Mouse";
        product.price = 100;

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        DatabaseHelper.Crud.update();
        DatabaseHelper.Connection.createConnection();
    }
}