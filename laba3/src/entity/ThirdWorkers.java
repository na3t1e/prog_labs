package entity;


import other.*;

public class ThirdWorkers extends Workers implements Banishing, Speaking, ShowingEmotions {


    public ThirdWorkers(FabricType type, boolean canFly) {
        super(type, canFly);
    }

    @Override
    public void banish(String text) {
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
    public void tellAbout() {
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
