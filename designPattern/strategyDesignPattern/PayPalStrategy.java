//Concrete Strategies

import withStrategy.PaymentStrategy;

public class PayPalStrategy implements PaymentStrategy { 
    public void processPayment(double amount){
        System.out.println("Processing payment of " + amount + "using Paypal strategy");
    }
}
