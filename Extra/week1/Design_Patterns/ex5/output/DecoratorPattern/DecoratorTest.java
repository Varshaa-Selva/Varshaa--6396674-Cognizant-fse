public class DecoratorTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        // Add SMS functionality
        Notifier emailAndSMS = new SMSNotifierDecorator(emailNotifier);

        // Add Slack functionality on top
        Notifier allChannels = new SlackNotifierDecorator(emailAndSMS);

        allChannels.send("System maintenance at 10 PM tonight.");
    }
}
