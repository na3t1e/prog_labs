package ru.itmo.lab2.attack;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam() {
        super(Type.FAIRY, 100, 80);
    }

    @Override
    protected String describe() {
        return "использует ослепительную вспышку";
    }
}
