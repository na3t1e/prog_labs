package workes;

import interfaces.ShowingEmotions;
import interfaces.Speaking;

public class Police extends Workers implements Speaking, ShowingEmotions {

    public Police(String name) {
        super(name);
    }

    public void stopped() {
        System.out.println(this.getName() + " перестали выступать против рабочих");
    }

    public void kick() {
        System.out.println(this.getName() + " выбрасывали свои ружья и пистолеты");
    }

    public void bury() {
        System.out.println(this.getName() + " закапывали в землю свои полицейские мундиры и каски");
    }

    public void wear() {
        System.out.println(this.getName() + " одевались как обыкновенные коротышки");
    }

    public void work() {
        System.out.println(this.getName() + " нанимались работать на фабрики и заводы");
    }

    public void tell() {
        System.out.println(this.getName() + " говорили, что это гораздо приятнее, чем летать сломя голову по воздуху в состоянии невесомости, получая ожоги, ранения и увечья");
    }

    @Override
    public void brave(boolean really) {
        if (really) {
            System.out.println(this.getName() + " не боялись всего происходящего");
        } else {
            System.out.println(this.getName() + " были напуганы всем происходящим");
        }
    }

    @Override
    public void tellAbout() {
        System.out.println(this.getName() + " говорили об этом");
    }
}
