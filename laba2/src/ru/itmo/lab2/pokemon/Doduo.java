package ru.itmo.lab2.pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.lab2.attack.*;


public class Doduo extends Pokemon {
      public Doduo(String s, int i) {
        super(s, i);
        setType(Type.NORMAL, Type.FLYING);
        setStats(35, 85, 45, 35, 35, 75);
        setMove(new SteelWing(), new Swagger(),new Roost());
    }
}
