package shorters;

import interfaces.Holding;
import interfaces.Missing;
import interfaces.Running;
import interfaces.Stopping;

public class Kozlic extends Shorters implements Running, Holding, Missing {
    public Kozlic(String name) {
        super(name);
    }

    @Override
    public void holdHands() {
        System.out.println(this.getName() + " взялся за руки");
    }

    @Override
    public void run(String text) {
        System.out.println(this.getName() + " бросился бежать к " + text);
    }

    @Override
    public void miss() {
        System.out.println(this.getName() + " не успел подняться по леснице");
    }
}
