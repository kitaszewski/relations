package pk.sandbox.relations.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class DetalCustomer extends Customer {

    @NotNull
    private String surname;
    private String pesel;
    private String idCard;

    public DetalCustomer() {
    }

    public DetalCustomer(String name, String surname) {
        super(name);
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
