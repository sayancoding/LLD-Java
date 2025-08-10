public class UPIPayment implements PaymentStrategy {
    String upiId;

    UPIPayment(String upiId){
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) {
        System.out.println(String.format("INR %s payment is done via UPI %s",amount,upiId));
    }
    
}
