package other;

import java.util.Objects;

public abstract class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName()) + 7;
    }

    @Override
    public String toString() {
        return "Рабочие професссии " + name;
    }
}
