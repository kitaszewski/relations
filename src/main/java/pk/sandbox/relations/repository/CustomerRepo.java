package pk.sandbox.relations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pk.sandbox.relations.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
