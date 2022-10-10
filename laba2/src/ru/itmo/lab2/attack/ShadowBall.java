package ru.itmo.lab2.attack;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 100, 80);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(Math.random()<0.2){
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "использует теневой шар";
    }
}
