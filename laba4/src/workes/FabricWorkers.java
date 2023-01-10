package workes;

import human.Human;
import interfaces.MakeWeightlessness;
import enums.FabricType;

public abstract class FabricWorkers extends Workers implements MakeWeightlessness {
    private FabricType type;
    private boolean CanFly;
    // Translate a single English String to French

    public FabricWorkers(FabricType type, boolean canFly) {
        super("рабочие " + type);
        this.type = type;
        CanFly = canFly;
    }

    public void setCanFly(boolean canFly) {
        CanFly = canFly;
    }

    public boolean isCanFly() {
        return CanFly;
    }

    @Override
    public String toString() {
        return "Рабочие типа " + type +
                ", делают невесомость: " + CanFly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Human)) return false;
        FabricWorkers fabricWorkers = (FabricWorkers) o;
        return CanFly == fabricWorkers.CanFly && type == fabricWorkers.type;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + type.hashCode();
    }
}
