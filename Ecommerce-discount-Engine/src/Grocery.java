public class Grocery extends Product{

    int quantity;

    Grocery(double price,int quantity) {
        super(price);
        this.quantity = quantity;
    }


    @Override
    double applyDiscount(double price) {
        return this.price * 0.95;
    }
}
