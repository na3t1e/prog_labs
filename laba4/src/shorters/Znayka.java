package shorters;

import interfaces.GoingOut;
import interfaces.Walking;

public class Znayka extends Shorters implements Walking, GoingOut {
    public Znayka(String name) {
        super(name);
    }

    @Override
    public void goOut(String text) {
        System.out.println(this.getName() + " сошел по трапу с "+ text);
    }

    @Override
    public String go(String text) {
        return (this.getName()+ " подошел к " + text);
    }
}
