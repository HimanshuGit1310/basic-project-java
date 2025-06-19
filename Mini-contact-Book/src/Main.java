import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Contact> contacts = new ArrayList<>();

        boolean isRunning = true;

        while (isRunning) {

            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter contact name : ");
                    String name = scanner.nextLine();

                    System.out.print("Enter contact number : ");
                    String number = scanner.nextLine();

                    System.out.print("Enter contact email : ");
                    String email = scanner.nextLine();

                    contacts.add(new Contact(name, number, email));

                    System.out.println("Contact added successfully ");
                    break;

                case 2:
                    System.out.print("Enter the Contact name : ");
                    String searchName = scanner.nextLine();

                    boolean isFound = false;
                    for (Contact c : contacts) {
                        if (c.name.equalsIgnoreCase(searchName)) {
                            isFound = true;
                            c.display();

                        }


                    }
                    if (!isFound){
                        printNotFoundMessage(searchName);
                    }
                    break;

                case 3 :

                    System.out.println("Enter the contact name: ");
                    String delName = scanner.nextLine();
                        Contact toRemove = null;
                    for (Contact c : contacts){
                        if(c.name.equalsIgnoreCase(delName)){
                            toRemove = c;
                        }

                    }
                    if (toRemove != null){
                        contacts.remove(toRemove);
                        System.out.println("Contact Remove Successfully");


                    }
                    else {
                        printNotFoundMessage(delName);
                    }

                    break;

                case 4 :
                    System.out.println("Enter the contact name you want to update : ");
                    String updateName = scanner.nextLine();
                    boolean Found = false;
                    for (Contact c : contacts){
                        if (c.name.equalsIgnoreCase(updateName)){
                            Found = true;
                            System.out.println("Enter new number : ");
                            c.number = scanner.nextLine();
                            System.out.println("Enter new email : ");
                            c.email = scanner.nextLine();

                            System.out.println("Contact Updated Successfully");
                        }
                    }
                    if (!Found){
                        printNotFoundMessage(updateName);
                    }
                    break;

                case 5:
                    for (Contact c : contacts){
                        c.display();
                    }
                    break;


                case 6:
                    isRunning = false;
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Option");

            }
        }
    }
    public static void printNotFoundMessage(String name) {
        System.out.println("❌ Contact named '" + name + "' does not exist.");
    }
}


