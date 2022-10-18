package ru.itmo.lab2.attack;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class BugBuzz extends SpecialMove {
    public BugBuzz() {
        super(Type.BUG, 100, 90);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        if (Math.random() < 0.1) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "использует Жужжание";
    }
}
