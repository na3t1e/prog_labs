package ru.itmo.lab2.pokemon;

import ru.itmo.lab2.attack.DracoMeteor;

public class Flygon extends Vibrava {

    public Flygon(String s, int i) {
        super(s, i);
        setStats(80, 100, 80, 80, 80, 100);
        addMove(new DracoMeteor());
    }
}
