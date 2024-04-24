// Here if a new payment method is added then we need to change code of processPayement method

public class OldPaymentProcessor {

    private PaymentType paymentType;

    public OldPaymentProcessor(PayPalStrategy payPalStrategy) {
        //TODO Auto-generated constructor stub
    }

    public void processPayment(int amount) {
        if (paymentType == PaymentType.CREDIT_CARD) {
            System.out.println("Payment is processed using " + paymentType + ": " + amount);
        } else if (paymentType == PaymentType.DEBIT_CARD) {
            System.out.println("Payment is processed using " + paymentType + ": " + amount);
        } else if (paymentType == PaymentType.PAYPAL) {
            System.out.println("Processing PayPal payment of amount " + amount);
        } else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;

    }


    public static void main(String args[]) // static method
    {
        OldPaymentProcessor processor = new OldPaymentProcessor(null);
        processor.setPaymentType(PaymentType.DEBIT_CARD);
        processor.processPayment(8000);
        // System.out.println("Static method");
    }

}

enum PaymentType {
    CREDIT_CARD,
    DEBIT_CARD,
    PAYPAL
}


