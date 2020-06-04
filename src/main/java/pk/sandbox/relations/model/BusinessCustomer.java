package pk.sandbox.relations.model;

import javax.persistence.Entity;

@Entity
public class BusinessCustomer extends Customer {
    private String nip;

    public BusinessCustomer() {
    }

    public BusinessCustomer(String name) {
        super(name);
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
