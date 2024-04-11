package iu.edu.nibomm.historyservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class PrimesRecord {

    @Id
    @GeneratedValue
    private int id;

    private String customer;
    private String n;
    private boolean isPrime;
    public int getId(){
        return id;
    }

    public void setCustomer(String customer) {
    }

    public void setN(int n) {
    }

    public void setPrime(Boolean isPrime) {
    }
}
