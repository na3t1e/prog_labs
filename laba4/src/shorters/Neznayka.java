package shorters;

import interfaces.*;

public class Neznayka extends Shorters implements Stopping, Running, Holding, Missing, Speaking {
    public Neznayka(String name) {
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
    public void stop() {
        System.out.println(this.getName() + " остановился, не смея ступить дальше ни шагу");
    }

    @Override
    public void miss() {
        System.out.println(this.getName() + " не успел подняться по леснице");
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + " пробормотал: Кажется, мне сейчас распеканция будет!");
    }
}
