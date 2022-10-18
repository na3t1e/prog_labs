package ru.itmo.lab2.attack;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt() {
        super(Type.ELECTRIC, 90, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        if (Math.random() < 0.1) {
            Effect.paralyze(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует 100000 Вольт";
    }
}
