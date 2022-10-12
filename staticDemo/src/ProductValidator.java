public class ProductValidator {
    static {
        System.out.println("Static constructor block executed");
    }

    // not discarded from static memory
    public static boolean isValid(Product product) {
        return product.price > 0 && !product.name.isEmpty();
    }

    // inner class
    public static class Test {
        public static void test() {
            System.out.println("Test");
        }
    }
}
