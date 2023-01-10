package workes;


import interfaces.Banishing;
import interfaces.ShowingEmotions;
import interfaces.Speaking;
import enums.*;

public class ThirdWorkers extends FabricWorkers implements Banishing, Speaking, ShowingEmotions {


    public ThirdWorkers(FabricType type, boolean canFly) {
        super(type, canFly);
    }

    @Override
    public void banish(String text) {
        this.setObedient(false);
        System.out.println(this.getName() + " прогоняли " + text);
    }

    @Override
    public void brave(boolean really) {
        if (really) {
            System.out.println(this.getName() + " осмелели");
        } else {
            System.out.println(this.getName() + " испугались");
        }
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + " говорили об этом");
    }

    @Override
    public void makeWeightlessness() {
        if (this.isCanFly()) {
            System.out.println(this.getName() + " с невесомостью брали власть в свои руки");
        } else {
            System.out.println(this.getName() + " без всякой невесомости брали власть в свои руки");
        }
    }
}
