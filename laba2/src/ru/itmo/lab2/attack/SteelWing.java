package ru.itmo.lab2.attack;

import ru.ifmo.se.pokemon.*;

public class SteelWing extends PhysicalMove {
    public SteelWing() {
        super(Type.STEEL, 70, 90);
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double v) {
        if (Math.random() < 0.1) {
            pokemon.setMod(Stat.DEFENSE, 1);
        }
    }

    @Override
    protected String describe() {
        return "использует Сталь-Крыло";
    }
}
