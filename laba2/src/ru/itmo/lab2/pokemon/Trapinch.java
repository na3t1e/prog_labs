package ru.itmo.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.attack.*;

public class Trapinch extends Pokemon {
    public Trapinch(String s, int i) {
        super(s, i);
        setType(Type.GROUND);
        setStats(45, 100, 45, 45, 45,10);
        setMove(new SandAttack(), new Facade());
        }
}
