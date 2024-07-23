package com.bancoapp.backend.banco_back.entities;
import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name = "clients")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String paternal;
    private String maternal;
    private String typedocument;
    private String documentidentity;
    private Date birthdate;
    private String gender;
    private Date createddate;
    private Date modifieddate;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPaternal() {
        return paternal;
    }
    public void setPaternal(String paternal) {
        this.paternal = paternal;
    }
    public String getMaternal() {
        return maternal;
    }
    public void setMaternal(String maternal) {
        this.maternal = maternal;
    }
    public String getTypedocument() {
        return typedocument;
    }
    public void setTypedocument(String typedocument) {
        this.typedocument = typedocument;
    }
    public String getDocumentidentity() {
        return documentidentity;
    }
    public void setDocumentidentity(String documentidentity) {
        this.documentidentity = documentidentity;
    }
    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
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
    
    
}
