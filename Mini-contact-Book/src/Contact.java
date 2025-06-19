public class Contact {
    String name;
    String number;
    String email;

    Contact(String name,String number,String email){
        this.name = name;
        this.number = number;
        this.email = email;

    }

    void display(){
        System.out.println("Contact Name : " + this.name);
        System.out.println("Contact Number : "+ this.number);
        System.out.println("Contact Email : "+ this.email);

    }
}
