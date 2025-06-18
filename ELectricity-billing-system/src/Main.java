public class Main {
    public static void main(String[] args) {

        Billable[] billable = { new ResidentialConnection(),
        new CommercialConnection(),
        new IndustrialConnection()
        };

        int[] units = {100,200,500};

        String[] connectionType = {"Residential","Commercial","Industrial"};
        for (int i = 0 ; i < billable.length ;i++){
            System.out.println(connectionType[i] + " Bill : ");
            double bill = billable[i].generateBill(units[i]);
            System.out.println("Unit Used : " + units[i]);
            System.out.println("Bill : " + bill);
            System.out.println();

        }
    }
}