package ru.itmo.lab2.attack;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Growl extends StatusMove {
    public Growl() {
        super(Type.NORMAL, 100, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, -1);

    }

    @Override
    protected String describe() {
        return "использует рычание";
    }
}
