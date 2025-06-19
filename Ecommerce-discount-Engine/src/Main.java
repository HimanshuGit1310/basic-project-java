
public class Main {
    public static void main(String[] args) {

        Product[] products = {
          new Electronic(100,"watch"),
          new Clothing(1000,"shirt"),
          new Grocery(200,5)
        };

        for (int i = 0 ; i < products.length;i++){
            double discountedValue = products[i].applyDiscount(products[i].price);
            System.out.println("Final price : " + discountedValue);
        }


    }
}