package ru.itmo.lab2.pokemon;

import ru.itmo.lab2.attack.Rest;

public class Togekiss extends Togetic {

    public Togekiss(String s, int i) {
        super(s, i);
        setStats(85, 50, 95, 120, 115, 80);
        addMove(new Rest());
    }
}
