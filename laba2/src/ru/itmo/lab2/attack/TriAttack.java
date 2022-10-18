package ru.itmo.lab2.attack;

import ru.ifmo.se.pokemon.*;

public class TriAttack extends SpecialMove {
    public TriAttack() {
        super(Type.NORMAL, 80,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.2) {
            double chanceCounter = Math.random();
            if (chanceCounter < 0.33){
                Effect.burn(pokemon);
            }else if (chanceCounter < 0.66){
                Effect.freeze(pokemon);
            }else {
                Effect.paralyze(pokemon);
            }
        }
    }

    @Override
    protected String describe() {
        return "использует Три-Атаку";
    }
}
