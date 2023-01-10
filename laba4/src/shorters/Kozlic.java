package shorters;

import interfaces.Holding;
import interfaces.Running;
import interfaces.Stopping;

public class Kozlic extends Shorters implements Running, Holding {
    public Kozlic(String name) {
        super(name);
    }

    @Override
    public void holdHands() {

    }

    @Override
    public void run() {

    }
}
