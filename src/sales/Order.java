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

    public double total() {
        double total = 0;

        for (int i = 0; i < this.productsCounter; i++) {
            // encapsulamiento por que no accedemos directamente al valor del precio de la
            // clase producto
            // sino que ya es por un método. Ya que price es private
            total += this.products[i].getPrice();
        }

        return total;
    }

    public void showOrder() {
        System.out.println("Id Order: " + this.idOrder);
        var totalOrder = this.total();
        System.out.println("\tTotal de la Orden: $" + totalOrder);
        System.out.println("\tProductos: ");

        for (int i = 0; i < this.productsCounter; i++) {
            System.out.println("\t\t" + this.products[i]);
        }
    }
}
