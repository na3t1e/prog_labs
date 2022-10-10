package ru.itmo.lab2;

import ru.ifmo.se.pokemon.Battle;
import ru.itmo.lab2.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Keldeo("Борис", 6));
        b.addAlly(new Togepi("Настя", 6));
        b.addAlly(new Onix("Полина", 6));
        b.addFoe(new Steelix("Армен", 6));
        b.addFoe(new Togetic("Илья", 6));
        b.addFoe(new Togekiss("Дима", 6));
        b.go();
    }
}
