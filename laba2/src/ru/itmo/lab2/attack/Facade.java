package ru.itmo.lab2.attack;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double v) {
        Status status = pokemon.getCondition();
        if (status.equals(Status.BURN) || status.equals(Status.POISON) || status.equals(Status.PARALYZE)) {
            pokemon.setMod(Stat.ATTACK, 2);
        }
    }

    @Override
    protected String describe() {
        return "использует Мужество";
    }
}
