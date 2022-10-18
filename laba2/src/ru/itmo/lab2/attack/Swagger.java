package ru.itmo.lab2.attack;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, 2);
        Effect.confuse(pokemon);
    }

    @Override
    protected String describe() {
        return "использует Щеольство";
    }
}
