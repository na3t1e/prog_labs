package shorters;

import interfaces.GoingOut;

public class Ponchik extends Shorters implements GoingOut {
    public Ponchik(String name) {
        super(name);
    }

    @Override
    public void goOut(String text) {
        System.out.println(this.getName() + " сошел по трапу с "+ text);
    }
}
