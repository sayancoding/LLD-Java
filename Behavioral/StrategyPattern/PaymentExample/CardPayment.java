
public class CardPayment implements PaymentStrategy {
    String cardNumber;

    CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(String.format("INR %s Payment is Done Via Card %s", amount, cardNumber));
    }

}
