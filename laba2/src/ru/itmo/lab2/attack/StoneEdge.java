package ru.itmo.lab2.attack;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 80, 100);
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        if (pokemon.getStat(Stat.SPEED) / 256.0 > Math.random()) {
            System.out.println("использует критический удар");
            return 2.0;
        } else {
            return 1.0;
        }
    }

    @Override
    protected String describe() {
        return "использует острые камни";
    }
}
