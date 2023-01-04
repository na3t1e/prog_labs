package workes;

import enums.FabricType;
import interfaces.Speaking;

public class SecondWorkers extends Workers implements Speaking {


    public SecondWorkers(FabricType type, boolean canFly) {
        super(type, canFly);
    }

    public void visit() {
        System.out.println(this.getName() + " приехали к космонавтам");
    }

    public void returned() {
        System.out.println(this.getName() + " вернулись");
    }

    @Override
    public void tellAbout() {
        System.out.println(this.getName() + " говорили об этом");
    }


    @Override
    public void makeWeightlessness() {
        if (this.isCanFly()) {
            System.out.println(this.getName() + " устраивали невесомость");
        } else {
            System.out.println(this.getName() + " не устраивали невесомость");
        }
    }
}
