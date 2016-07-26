package com.example.guest.battlecats;

import java.util.ArrayList;
import java.util.Random;


public class Ship{
    private Integer length;
    private String name;
    private ArrayList<String> cells = new ArrayList<>();
    private Integer startingPoint;

    public Ship(Integer length, String name){
        this.length=length;
        this.name=name;
    }

    public ArrayList<String> getCells() {
        return this.cells;
    }

    public Integer getLength() {
        return this.length;
    }

    public String getName() {
        return this.name;
    }

    public Integer getStartingPoint() {
        return this.startingPoint;
    }
}