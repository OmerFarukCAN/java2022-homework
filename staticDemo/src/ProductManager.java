public class ProductManager {
    public void add(Product product) {
        if (ProductValidator.isValid(product)) {
            System.out.println("Product added");
        } else {
            System.out.println("Invalid product");
        }
        ProductValidator.Test.test();
    }
}
