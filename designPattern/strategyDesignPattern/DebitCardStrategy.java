//Concrete Strategies

import withStrategy.PaymentStrategy;

public class DebitCardStrategy implements PaymentStrategy{
    public void processPayment(double amount){
        System.out.println("Processing payment " + amount+ "using DEBIT_CARD_STRATEGY"); ;
    }
}
