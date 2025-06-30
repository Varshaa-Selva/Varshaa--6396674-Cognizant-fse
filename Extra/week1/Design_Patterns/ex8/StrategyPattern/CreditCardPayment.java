public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card [" + cardHolderName + ", " + cardNumber + "]");
    }
}
// This class implements the PaymentStrategy interface and provides a specific
// implementation for credit card payments.