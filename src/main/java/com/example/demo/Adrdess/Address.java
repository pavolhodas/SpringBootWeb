package com.example.demo.Adrdess;

import com.example.demo.Company.Company;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Address{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String street;
    private String zipCode;
    private String city;
    private String state;

    @OneToOne
    private Company company;

    public Address(String street, String zipCode, String city,  String state){
        super();
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }
}
