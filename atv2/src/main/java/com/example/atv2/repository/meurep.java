package com.example.atv2.repository;


import java.util.HashMap;

import com.example.atv2.model.carro;

import org.springframework.stereotype.Repository;

/**
 * CarsRepository
 */
@Repository
public class meurep {

    HashMap<Integer, carro> cars = new HashMap<>();

    public meurep() {
        cars.put(1, new carro(1, 50000, "HB-20", "Flex",2017, "FTS-5452"));
        cars.put(2, new carro(2, 36900, "Saveiro", "Cross",2016, "GTS-7896"));
        cars.put(3, new carro(3, 116000, "BMW", "320i",2018 ,"BCH-3652"));
        cars.put(4, new carro(4, 24999, "Gol", "Quadrado",2004, "DJH-6412"));
        cars.put(5, new carro(5, 61900, "Jeep", "Renegade",2015, "AND-3625"));
    }

    public carro getId(int id){
        return cars.get(id);
    }

    public HashMap<Integer,carro> getCars(){
        return cars;
    }
}