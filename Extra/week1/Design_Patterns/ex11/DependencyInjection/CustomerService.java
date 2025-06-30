public class CustomerService {
    private final CustomerRepository repository;

    // Constructor Injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void displayCustomer(int id) {
        Customer customer = repository.findCustomerById(id);
        System.out.println("Customer ID   : " + customer.getId());
        System.out.println("Customer Name : " + customer.getName());
    }
}
