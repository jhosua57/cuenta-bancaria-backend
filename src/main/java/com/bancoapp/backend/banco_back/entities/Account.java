package com.bancoapp.backend.banco_back.entities;

import java.math.BigDecimal;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
    private String producttype;
    private String accountnumber;
    private String currency;
    private BigDecimal amount;
    private Date createddate;
    private Date modifieddate;
    private String branch;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getProducttype() {
        return producttype;
    }
    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }
    public String getAccountnumber() {
        return accountnumber;
    }
    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public Date getCreateddate() {
        return createddate;
    }
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }
    public Date getModifieddate() {
        return modifieddate;
    }
    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    
}
