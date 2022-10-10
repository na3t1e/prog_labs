package ru.itmo.lab2.attack;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HydroPump extends SpecialMove {
    public HydroPump() {
        super(Type.WATER, 80, 110);
    }


    @Override
    protected String describe() {
        return "использует гидронасос";
    }
}
