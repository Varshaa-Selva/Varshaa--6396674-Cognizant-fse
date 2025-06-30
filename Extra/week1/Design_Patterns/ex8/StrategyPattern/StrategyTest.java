public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "Varshaa Selvanarayanan"));
        context.executePayment(2500.75);

        // Using PayPal
        context.setPaymentStrategy(new PayPalPayment("varshaa@example.com"));
        context.executePayment(980.00);
    }
}
// This class tests the Strategy Pattern implementation for payment methods.
// It creates a PaymentContext and sets different payment strategies to execute
// payments.
// The output will show how the payment is processed using the selected
// strategy.