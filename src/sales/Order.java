package sales;

public class Order {
    private final int idOrder;
    private Product[] products;
    private int productsCounter;
    private static final int MAX_PRODUCTS = 10;
    private static int ordersCounter;

    public Order() {
        this.idOrder = ++Order.ordersCounter;
        // Create products array with a size MAX_PRODUCTS
        this.products = new Product[Order.MAX_PRODUCTS];
    }

    // Method add product
    public void addProduct(Product product) {
        if (this.productsCounter < Order.MAX_PRODUCTS) {
            this.products[this.productsCounter++] = product;
        } else {
            System.out.println("¡Has exedido el máximo de productos para tu orden!");
            System.out.println("Máximo de productos a ingresar: " + Order.MAX_PRODUCTS);
        }
    }
}
