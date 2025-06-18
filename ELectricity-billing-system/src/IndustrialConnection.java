public class IndustrialConnection implements Billable{

    @Override
    public double generateBill(int unit){
        double fixedCharge = 500;
        return fixedCharge + (unit * 10);
    }
}
