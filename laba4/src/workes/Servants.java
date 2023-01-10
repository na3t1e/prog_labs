package workes;


import interfaces.Running;

public class Servants extends Workers implements Running {
    public Servants(String name) {
        super(name);
    }

    @Override
    public void run(String text) {
        System.out.println(this.getName()+" убежали от "+ text);
    }
}
