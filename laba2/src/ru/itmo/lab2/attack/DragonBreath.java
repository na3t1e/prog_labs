package ru.itmo.lab2.attack;

import ru.ifmo.se.pokemon.*;

public class DragonBreath extends SpecialMove {
    public DragonBreath() {
        super(Type.DRAGON, 100, 60);
    }

    @Override
    protected String describe() {
        return "использует вздох дракона";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.3) {
            Effect.paralyze(pokemon);
        }
    }
}
