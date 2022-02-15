package com.springdata.jpa.onetoone.OneToOne.entity.jointable;

import javax.persistence.*;

@Entity
@Table
public class EmployeeJoinTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    
    //The element 'joinColumns' is used to specify foreign key column of the join table which references the source table (the owner of the association).

//The element 'inverseJoinColumns' is used to specify foreign key column of the join table which references the target table (the inverse side of the association).
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_address_relation",
    joinColumns = {@JoinColumn(name = "user_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "address_id",referencedColumnName = "id")})
    private AddressJoinTable address;

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

    public AddressJoinTable getAddress() {
        return address;
    }

    public void setAddress(AddressJoinTable address) {
        this.address = address;
    }
}
