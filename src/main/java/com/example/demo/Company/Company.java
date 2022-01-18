package com.example.demo.Company;

import com.example.demo.Adrdess.Address;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;

    @OneToOne(cascade = {CascadeType.ALL})
    private Address address;

    public Company(String name, Address address){
        this.name = name;
        this.address = address;
    }
}
