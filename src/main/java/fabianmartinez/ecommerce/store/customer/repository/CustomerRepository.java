package fabianmartinez.ecommerce.store.costumer.repository;

import fabianmartinez.ecommerce.store.costumer.repository.entity.Customer;
import fabianmartinez.ecommerce.store.costumer.repository.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long > {

    public Customer findByNumberId(String numberId);
    public List<Customer> findByLastName(String lastName);
    public List<Customer> findByRegion(Region region);
}
