package pk.sandbox.relations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pk.sandbox.relations.exception.MissingCustomerIDs;
import pk.sandbox.relations.model.Customer;
import pk.sandbox.relations.repository.CustomerRepo;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin
public class CustomerAPI {

    CustomerRepo customerRepo;

    @Autowired
    public CustomerAPI(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @GetMapping
    public ResponseEntity<List<Customer>> findAll(){
        return ResponseEntity.ok(customerRepo.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable Long id){
        Optional<Customer> customer = customerRepo.findById(id);
        if(!customer.isPresent()){
            return ResponseEntity.badRequest().header("API-Error", "Klient nie istnieje").build();
        }
        return ResponseEntity.ok(customer.get());
    }

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer){
        return ResponseEntity.ok(customerRepo.save(customer));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> update(@PathVariable Long id, @RequestBody Customer customer){
        if(!customerRepo.findById(id).isPresent()){
            return ResponseEntity.badRequest().header("API-Error", "Klient nie istnieje").build();
        }
        if(!id.equals(customer.getId())){
            throw new MissingCustomerIDs("IDs are not the same", id, customer.getId());
        }
        return ResponseEntity.ok(customerRepo.save(customer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        if(!customerRepo.findById(id).isPresent()){
            return ResponseEntity.badRequest().header("API-Error", "Klient nie istnieje").build();
        }

        customerRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
