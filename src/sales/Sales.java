package sales;

public class Sales {
    public static void main(String[] args) {
        System.out.println("*** Sales System ***");

        var t_Shirt = new Product("T-Shirt", 123);
        var pans = new Product("Pans", 234);

        // Add first order
        Order order1 = new Order();
        order1.addProduct(t_Shirt);
        order1.addProduct(pans);

        order1.showOrder();

        // Second Order
        Order order2 = new Order();
        order2.addProduct(new Product("Glasses", 234.56));
        order2.addProduct(pans);

        order2.showOrder();
    }
}