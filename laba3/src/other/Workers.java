package other;

public abstract class Workers extends Human implements MakeWeightlessness {
    private FabricType type;
    private boolean CanFly;

    public Workers(FabricType type, boolean canFly) {
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
        Workers workers = (Workers) o;
        return CanFly == workers.CanFly && type == workers.type;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + type.hashCode();
    }
}
