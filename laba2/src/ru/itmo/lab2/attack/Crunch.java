package ru.itmo.lab2.attack;

import ru.ifmo.se.pokemon.*;

public class Crunch extends PhysicalMove {
    public Crunch() {
        super(Type.DARK, 100, 80);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.2) {
            pokemon.setMod(Stat.DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "использует разгрызание";
    }
}
