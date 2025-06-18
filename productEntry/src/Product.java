public class Product {
    int id;
    String name ;
    double price;
    int quantity;

    Product(int id,String name,double price,int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void details() {
        System.out.println();
        System.out.println("ID :" + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Price : " + this.price);
        System.out.println("Quantity : "+ this.quantity );

    }


}
