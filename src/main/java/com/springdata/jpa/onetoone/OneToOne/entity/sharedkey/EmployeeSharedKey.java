package com.springdata.jpa.onetoone.OneToOne.entity.sharedkey;

import javax.persistence.*;

@Entity
@Table(name = "employee_shared_key")
public class EmployeeSharedKey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private AddressSharedKey address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressSharedKey getAddress() {
        return address;
    }

    public void setAddress(AddressSharedKey address) {
        this.address = address;
    }
}
