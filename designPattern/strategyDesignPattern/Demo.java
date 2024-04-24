

public class Demo {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new DebitCardStrategy());

        paymentProcessor.processMyPayment(8000);

    }
}