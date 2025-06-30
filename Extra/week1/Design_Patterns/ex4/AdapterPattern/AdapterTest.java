public class AdapterTest {
    public static void main(String[] args) {
        // Using PayPal via Adapter
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        paypalProcessor.processPayment(1500.0);

        // Using Stripe via Adapter
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(2200.0);
    }
}
// This class tests the Adapter Pattern by processing payments through both
// PayPal and Stripe gateways using their respective adapters.
// It demonstrates how the Adapter Pattern allows different interfaces to work
// together seamlessly.