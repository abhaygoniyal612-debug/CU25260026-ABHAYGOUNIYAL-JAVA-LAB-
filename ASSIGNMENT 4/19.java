class Product {
    int id;
    String name;
    double price;
    static double discountRate = 10;

    void calculatePrice() {
        double productPrice = price;
        double discount = productPrice * discountRate / 100;
        double finalPrice = productPrice - discount;

        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Original Price: " + productPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
    }

    public static void main(String[] args) {
        Product p = new Product();

        int productId = 101;
        String productName = "Laptop";
        double productPrice = 50000;

        p.id = productId;
        p.name = productName;
        p.price = productPrice;

        p.calculatePrice();
    }
}