package shorters;

import interfaces.Holding;
import interfaces.Running;
import interfaces.Stopping;

public class Neznayka extends Shorters implements Stopping, Running, Holding {
    public Neznayka(String name) {
        super(name);
    }

    @Override
    public void holdHands() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
