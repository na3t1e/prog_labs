package ru.itmo.lab2.pokemon;

import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.attack.BugBuzz;

public class Vibrava extends Trapinch {
    public Vibrava(String s, int i) {
        super(s, i);
        addType(Type.DRAGON);
        setStats(50, 70, 50, 50, 50, 70);
        addMove(new BugBuzz());
    }
}
