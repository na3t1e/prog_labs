package workes;

import interfaces.Banishing;
import enums.FabricType;

public class FirstWorkers extends Workers implements Banishing {
    public FirstWorkers(FabricType type, boolean canFly) {
        super(type, canFly);
    }

    @Override
    public void banish(String text) {
        System.out.println(this.getName() + " прогнали " + text);
    }

    @Override
    public void makeWeightlessness() {
        if (this.isCanFly()) {
            System.out.println(this.getName() + " овладели невесомостью");
        } else {
            System.out.println(this.getName() + " не овладели невесомостью");
        }
    }
}
