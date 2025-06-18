public class ResidentialConnection implements Billable{

    @Override
    public double generateBill(int unit){
        return unit * 5;
    }
}
