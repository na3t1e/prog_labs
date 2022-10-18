package ru.itmo.lab2.attack;

import ru.ifmo.se.pokemon.*;

public class DracoMeteor extends SpecialMove {
    public DracoMeteor() {
        super(Type.DRAGON, 130, 90);
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, -2);
    }

    @Override
    protected String describe() {
        return "использует Драко-Метеор";
    }
}
