package places;

import interfaces.GoingDown;
import interfaces.Spinning;

public class Steamship extends Places implements Spinning, GoingDown {
    public Steamship(String name) {
        super(name);
    }

    @Override
    public void goDown() {
        System.out.println(this.getName() + " плавно опустился на воду");
    }

    @Override
    public void spin() {
        System.out.println(this.getName() + " описал дугу над пристанью");
    }
}
