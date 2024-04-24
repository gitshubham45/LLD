
//Concrete Strategies
import withStrategy.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of amount " + amount);
    }
}