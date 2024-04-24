
//context
import withStrategy.PaymentStrategy;

public class PaymentProcessor {
    PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processMyPayment(double amount) {
        paymentStrategy.processPayment(amount);
    }
}
