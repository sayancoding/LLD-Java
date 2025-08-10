public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy){
        this.paymentStrategy = strategy;
    }

    public void checkout(int amount){
        if(paymentStrategy == null){
            throw new RuntimeException("Payment Strategy is not chosen!!");
        }else{
            paymentStrategy.pay(amount);
        }
    }
}
