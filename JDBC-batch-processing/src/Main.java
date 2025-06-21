import java.sql.*;
import java.util.Scanner;

public class Main {

    private static final String url = "jdbc:mysql://localhost:3306/mydb";

    private static final String username = "root";

    private static final String password = "Zeal@4518";

    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Scanner scanner = new Scanner(System.in);
            Connection con = DriverManager.getConnection(url,username,password);
            Statement statement = con.createStatement();

            while (true){
                System.out.println("Enter Your Name : " );
                String name = scanner.nextLine();

                System.out.println("Enter your age : ");
                int age = scanner.nextInt();

                System.out.println("Enter Your Marks : ");
                double marks = scanner.nextDouble();

                String query = String.format("INSERT INTO student (name,age,marks) VALUES('%s',%o,%f)",name,age,marks);
                statement.addBatch(query);

                System.out.println("You want to enter more data (Y/N) : ");
                String choice = scanner.next();

                if (choice.toUpperCase().contains("N")){
                    break;
                }

            }

            int[] arr = statement.executeBatch();

            for (int i = 0 ; i < arr.length ; i++){
                if (arr[i] == 0){
                    System.out.println("Query no." + i );
                }

            }

        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

