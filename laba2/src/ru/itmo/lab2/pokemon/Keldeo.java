package ru.itmo.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.attack.DoubleTeam;
import ru.itmo.lab2.attack.FocusBlast;
import ru.itmo.lab2.attack.HydroPump;
import ru.itmo.lab2.attack.SwordsDance;

public class Keldeo extends Pokemon {
    public Keldeo(String s, int i) {
        super(s, i);
        setType(Type.WATER, Type.FIGHTING);
        setStats(91, 72, 90, 129, 90, 108);
        setMove(new FocusBlast(), new HydroPump(), new SwordsDance(), new DoubleTeam()) ;
    }
}
