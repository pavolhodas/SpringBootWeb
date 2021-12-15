package com.example.demo.Adrdess;

import com.example.demo.Company.Company;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address extends Company{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String street;
    private String zipCode;
    private String city;
    private String state;

    Address(){

    }

    Address(Integer id, String street, String zipCode, String city,  String state){
        super();
        this.id = id;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
}
