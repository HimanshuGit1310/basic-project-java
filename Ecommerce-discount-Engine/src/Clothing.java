public class Clothing extends Product{

    String clothingType;

    Clothing(double price,String clothingType) {
        super(price);
        this.clothingType = clothingType;
    }

    @Override
    double applyDiscount(double price) {
        return price * 0.80;
    }
}
