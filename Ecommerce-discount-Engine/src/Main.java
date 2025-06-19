
public class Main {
    public static void main(String[] args) {

        Product[] products = {
          new Electronic(100,"watch"),
          new Clothing(1000,"shirt"),
          new Grocery(200,5)
        };

        String[] productType = { "Watch","Shirt","Grocery"};

        for (int i = 0 ; i < products.length;i++){
            System.out.println(productType[i] + " Bill");
            double originalPrice = products[i].price;
            double discountedValue = products[i].applyDiscount(products[i].price);

            System.out.println("Original Price : " + originalPrice );
            System.out.println("Final price : " + discountedValue);
            System.out.println();
        }


    }
}