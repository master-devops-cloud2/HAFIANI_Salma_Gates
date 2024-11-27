package org.example.exercice1.service;

import org.example.exercice1.entities.Nombres;
import org.springframework.stereotype.Service;

@Service
public class ServiceCalcul {
    public double SommeOperation(Nombres nombres){

        return nombres.getA()+nombres.getB();

    }
}
