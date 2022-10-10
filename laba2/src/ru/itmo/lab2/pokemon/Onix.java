package ru.itmo.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.attack.DragonBreath;
import ru.itmo.lab2.attack.IronTail;
import ru.itmo.lab2.attack.StoneEdge;

public class Onix extends Pokemon {
      public Onix(String s, int i) {
        super(s, i);
        setType(Type.ROCK, Type.GROUND);
        setStats(35, 45, 160, 30, 45, 70);
        setMove(new IronTail(), new StoneEdge(),new DragonBreath());
    }
}
