package com.springdata.jpa.onetoone.OneToOne.entity.sharedkey;

import javax.persistence.*;

@Entity
@Table(name = "address_shared_key")
public class AddressSharedKey {

    @Id
    @Column(name = "address_id")
    private long id;

    @Column
    private String address1;

    @Column
    private String address2;

    @Column
    private String city;

    @Column
    private String zipcode;

    @Column
    private String state;

    @Column
    private String country;

    @OneToOne
    @MapsId
    @JoinColumn(name = "address_id")
    // make sure you do not have getter for EmployeeSharedKey object
    // it will throw error if you try to return same object as it is
    // you need tranasformer of you keep getter for EmployeeSharedKey
    private EmployeeSharedKey employee;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmployee(EmployeeSharedKey employee) {
        this.employee = employee;
    }
}
