public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        // Mocked DB fetch
        if (id == 101) {
            return new Customer(101, "Varshaa S.");
        } else {
            return new Customer(id, "Unknown Customer");
        }
    }
}
