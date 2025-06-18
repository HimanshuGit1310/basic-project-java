import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Product[] products;
        System.out.print("Enter the no of Products : ");
        int size = scanner.nextInt();
        scanner.nextLine();
        products = new Product[size];
        for (int i = 0 ; i < products.length ;i++ ){

            System.out.println();
            System.out.print("Enter the datils of product no: " + (i + 1) );
            System.out.println();

            System.out.print("Enter the Product Id : ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the Name of Product : ");
            String name = scanner.nextLine();

            System.out.print("Enter the Price of product : ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter the Quantity of product : ");
            int quantity = scanner.nextInt();



            products[i] = new Product(id,name,price,quantity);
        }

        System.out.println("List of product have Price above 500 :");

        for (Product product:products){
            if (product.price > 500) {
                product.details();
            }
        }

        System.out.println("List of product have quantity below 10 :");
        for (Product product:products){
            if (product.quantity < 10) {
                product.details();
            }
        }


        scanner.close();

    }
}


