public class Electronic extends Product{

    String itemName;
    Electronic(double price,String itemName){
        super(price);
        this.itemName = itemName;
    }

    @Override
    double applyDiscount(double price) {
        return price * 0.90;
    }
}
