public class DIApp {
    public static void main(String[] args) {
        // Manually inject the dependency
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);

        // Test the service
        service.displayCustomer(101);
        System.out.println("---");
        service.displayCustomer(999); // Unknown
    }
}
