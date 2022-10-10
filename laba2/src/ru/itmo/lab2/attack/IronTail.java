package ru.itmo.lab2.attack;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class IronTail extends PhysicalMove {
    public IronTail() {
        super(Type.STEEL, 75, 100, 0, 15);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.3) {
            pokemon.setMod(Stat.DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "использует стальной хвост";
    }
}
