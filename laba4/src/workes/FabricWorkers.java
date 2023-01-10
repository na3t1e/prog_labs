package workes;

import exeptions.NoPeopleException;
import exeptions.SalaryException;
import human.Human;
import interfaces.MakeWeightlessness;
import enums.FabricType;

public abstract class FabricWorkers extends Workers implements MakeWeightlessness {
    private FabricType type;
    private boolean CanFly;
    // Translate a single English String to French

    private boolean obedient;
    private int salary;

    public FabricWorkers(FabricType type, boolean canFly) {
        super("рабочие " + type.getName());
        this.type = type;
        this.obedient = true;
        this.CanFly = canFly;
        this.salary = 10;
        Condition.addPerson();
    }

    public void earning(int cost, int duration) {
        class Salary {
            private final int cost;
            private int newSalary;

            Salary(int cost) {

                this.cost = cost;
                newSalary = cost - 2;
            }

            public int getSalary(int duration, boolean obedient) {
                if (obedient) {
                    newSalary *= duration;
                    newSalary -= newSalary * 0.5;
                    return newSalary;
                } else {
                    return newSalary *= duration;
                }
            }

            public void getDescription(int salary) {
                if (salary == 0) {
                    System.out.println("Достаточно неплохая зарплата для безработного");

                } else if (salary < 250) {
                    System.out.println("Зарплата рядового работяги");

                } else {
                    System.out.println("Еще чуть-чуть и войдет в класс богачей");
                }

            }

        }
        Salary salary = new Salary(cost);
        int budget = salary.getSalary(duration, this.obedient);
        this.salary = budget;
        salary.getDescription(budget);
    }

    public static class Condition {
        static int countPeople = 0;
        static int salary;


        static void addPerson() {
            countPeople += 1;
        }

        public static void getDescription() {
            if (countPeople < 1){
                throw new NoPeopleException();
            }
            int count = salary / countPeople;
            if (count < 10) {
                System.out.println("Каждый стал питаться хуже и не может покупать товары");
            } else if (count < 100) {
                System.out.println("Каждый стал питаться лучше, но не может покупать товары");
            } else {
                System.out.println("Каждый стал питаться лучше и может покупать больше товаров");

            }
        }
    }

    public int getSalary() throws SalaryException {
        if (salary < 0) {
            throw new SalaryException();
        } else {
            Condition.salary += salary;
            return salary;
        }
    }

    public void setCanFly(boolean canFly) {
        CanFly = canFly;
    }

    public boolean isCanFly() {
        return CanFly;
    }

    public void setObedient(boolean obedient) {
        this.obedient = obedient;
    }

    public boolean isObedient() {
        return obedient;
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
