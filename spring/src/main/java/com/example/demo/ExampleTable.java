package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MyTable")
public class ExampleTable {

    @Id
    @Column(name = "LastName")
    private String LastName;

    public String getLastName() {
        return LastName;
    }
}
