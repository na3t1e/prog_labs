package ru.itmo.lab2.pokemon;


import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.attack.TriAttack;


public class Dodrio extends Doduo {

    public Dodrio(String s, int i) {
        super(s, i);
        setType(Type.STEEL, Type.GROUND);
        setStats(75, 85, 200, 55, 65, 30);
        addMove(new TriAttack());
    }
}
