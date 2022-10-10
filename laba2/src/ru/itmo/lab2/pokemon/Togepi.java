package ru.itmo.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.attack.DazzlingGleam;
import ru.itmo.lab2.attack.ShadowBall;

public class Togepi extends Pokemon {
    public Togepi(String s, int i) {
        super(s, i);
        setType(Type.FAIRY);
        setStats(35, 20, 65, 40, 65, 20);
        setMove(new ShadowBall(), new DazzlingGleam());
        }
}
