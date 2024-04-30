package fabianmartinez.ecommerce.store.costumer.service;

import fabianmartinez.ecommerce.store.costumer.repository.CustomerRepository;
import fabianmartinez.ecommerce.store.costumer.repository.entity.Customer;
import fabianmartinez.ecommerce.store.costumer.repository.entity.Region;

import java.util.List;


public interface CustomerService{

    public List<Customer> findCustomerAll();
    public List<Customer> findCustomersByRegion(Region region);
    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public Customer deleteCustomer(Customer customer);
    public Customer getCustomer(Long id);
}
