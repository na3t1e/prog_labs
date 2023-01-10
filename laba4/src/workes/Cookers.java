package workes;

import interfaces.Preferring;
import interfaces.Running;

public class Cookers extends Workers implements Running, Preferring {
    public Cookers(String name) {
        super(name);
    }

    @Override
    public void run(String text) {
        System.out.println(this.getName()+" убежали от "+ text);
    }

    @Override
    public String prefer() {
        return this.getName() + " предпочитали работать в ";
    }
}
