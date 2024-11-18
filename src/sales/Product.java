package sales;

public class Product {
    private final int idProduct;
    private String name;
    private double price;
    private static int counterProducts;

    public Product(String name, double price) {
        this.idProduct = ++Product.counterProducts;
        this.name = name;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product {" + "idProduct: " + this.idProduct
                + ", name: " + this.name + ", price: " + this.price + "}";
    }
}