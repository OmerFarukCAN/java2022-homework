public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Laptop");
        product1.setDescription("Apple");
        product1.setPrice(30000);
        product1.setStockAmount(10);

        ProductManager productManager = new ProductManager();
        productManager.add(product1);

        Product product2 = new Product(2, "Camera", "Samsung", 25000, 15);
        productManager.add(product2);
    }
}

