public class Grocery extends Product{

    int quanity;

    Grocery(double price,int quantity) {
        super(price);
        this.quanity = quantity;
    }


    @Override
    double applyDiscount(double price) {
        return price * 0.95;
    }
}
