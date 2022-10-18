package ru.itmo.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.attack.*;

public class Absol extends Pokemon {
    public Absol(String s, int i) {
        super(s, i);
        setType(Type.DARK);
        setStats(65, 130, 60, 75, 60, 75);
        setMove(new ShadowClaw(), new Swagger(), new Thunderbolt(), new SwordsDance()) ;
    }
}
