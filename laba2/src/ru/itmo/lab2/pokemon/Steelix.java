package ru.itmo.lab2.pokemon;


import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.attack.Crunch;

public class Steelix extends Onix {

    public Steelix(String s, int i) {
        super(s, i);
        setType(Type.STEEL, Type.GROUND);
        setStats(75, 85, 200, 55, 65, 30);
        addMove(new Crunch());
    }
}
