package shorters;

import interfaces.GoingOut;

public class Vintik extends Shorters implements GoingOut {
    public Vintik(String name) {
        super(name);
    }

    @Override
    public void goOut(String text) {
        System.out.println(this.getName() + " сошел по трапу с "+ text);
    }
}
