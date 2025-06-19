public abstract class Product {

    double price;
    Product(double price) {
        this.price = price;
    }
    abstract double applyDiscount(double price);
}
