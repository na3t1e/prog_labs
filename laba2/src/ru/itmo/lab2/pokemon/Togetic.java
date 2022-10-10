package ru.itmo.lab2.pokemon;

import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.attack.Growl;

public class Togetic extends Togepi {
    public Togetic(String s, int i) {
        super(s, i);
        addType(Type.FLYING);
        setStats(55, 40, 85, 80, 105, 40);
        addMove(new Growl());
    }
}
