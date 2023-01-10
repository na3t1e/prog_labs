package shorters;

import interfaces.GoingOut;
import interfaces.Walking;

public class Pilulkin extends Shorters implements GoingOut {
    public Pilulkin(String name) {
        super(name);
    }

    @Override
    public void goOut(String text) {
        System.out.println(this.getName() + " сошел по трапу с "+ text);
    }
}
