public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        int amount = 500;
        paymentService.setPaymentStrategy(new UPIPayment("sayan@okaxis.com"));
        paymentService.checkout(amount);

        amount = 20000;
        paymentService.setPaymentStrategy(new CardPayment("4545-1245-8754-1005"));
        paymentService.checkout(amount);
    }

     /* 
     * Client (choose right strategy) -> Context(Payment Service)
     * Context -> Payment Strategy Implementation to do the job
     */
}

/*
 * Output : 
 * INR 500 payment is done via UPI sayan@okaxis.com
 * INR 20000 Payment is Done Via Card 4545-1245-8754-1005
 */
