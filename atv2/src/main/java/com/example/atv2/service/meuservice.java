package com.example.atv2.service;

import java.util.ArrayList;

import com.example.atv2.model.carro;
import com.example.atv2.repository.meurep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * meuservice
 */
@Service
public class meuservice {
    @Autowired
    private meurep cars;

    public carro getCar(int id) {
        return cars.getId(id);
    }

    public ArrayList<carro> getCars() {
        ArrayList<carro> c = new ArrayList<>(cars.getCars().values());

        if (c.isEmpty())
            return null;
        return c;
    }
}