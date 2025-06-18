public class CommercialConnection implements Billable{

    @Override
    public double generateBill(int unit){
        return unit * 8;
    }
}
