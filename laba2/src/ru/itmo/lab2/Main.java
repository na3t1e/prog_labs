package ru.itmo.lab2;

import ru.ifmo.se.pokemon.Battle;
import ru.itmo.lab2.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Absol("Борис", 6));
        b.addAlly(new Trapinch("Настя", 6));
        b.addAlly(new Doduo("Полина", 6));
        b.addFoe(new Dodrio("Армен", 6));
        b.addFoe(new Vibrava("Илья", 6));
        b.addFoe(new Flygon("Дима", 6));
        b.go();
    }
}
