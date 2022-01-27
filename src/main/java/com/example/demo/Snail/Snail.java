package com.example.demo.Snail;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Snail {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private double highOfStep;
    private double lengthOfStep;
    private double towerHigh;
    private double totalDistance;

}
