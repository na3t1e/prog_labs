import exeptions.SalaryException;
import places.*;
import shorters.*;
import sleepWalkers.Richers;
import workes.*;
import enums.FabricType;

import java.util.concurrent.locks.Condition;

public class Main {
    public static void main(String[] args) {
        Police police = new Police("Полицейские");
        FirstWorkers firstWorkers = new FirstWorkers(FabricType.SCAPERFIELDS, true);
        SecondWorkers secondWorkers = new SecondWorkers(FabricType.OTHER_FACTORIES, true);
        ThirdWorkers thirdWorkers = new ThirdWorkers(FabricType.SOME_FACTORIES, false);
        Neznayka neznayka = new Neznayka("Незнайка");
        Kozlic kozlic = new Kozlic("Козлик");
        Znayka znayka = new Znayka("Знайка");
        Pilulkin pilulkin = new Pilulkin("доктор Пилюлькин");
        Ponchik ponchik = new Ponchik("Пончик");
        Shpontik shpontik = new Shpontik("Шпонтик");
        Vintik vintik = new Vintik("Винтик");
        Steamship steamship = new Steamship("пароход");
        Places restaurant = new Restaurant("ресторан");
        Places canteen = new Canteen("столовая");
        Shorters unknown = new Shorters("несколько незнакомых лунатиков") {
            @Override
            public String toString() {
                return "несколько незнакомых лунатиков";
            }
        };
        Shorters other = new Shorters("остальные коротышки") {
            @Override
            public String toString() {
                return "остальные коротышки";
            }
        };
        Servants maids = new Servants("служанки");
        Servants housemaids = new Servants("горничные");
        Servants laundresses = new Servants("прачки");
        Servants doormen = new Servants("швейцары");
        Servants cleaners = new Servants("полотеры");
        Cookers cookmen = new Cookers("повара");
        Cookers cookwomen = new Cookers("поварихи");
        Richers richers = new Richers("богачи") {
            @Override
            public String toString() {
                return "богачи";
            }
        };

        Fabric firstFabric = new Fabric("Скуперфильда", FabricType.SCAPERFIELDS);
        Fabric secondFabric = new Fabric("другая", FabricType.OTHER_FACTORIES);
        Fabric otherFabric = new Fabric("некоторая", FabricType.SOME_FACTORIES);

        Fabric.Stock stock1 = firstFabric.new Stock(30);
        Fabric.Stock stock2 = secondFabric.new Stock(63);
        Fabric.Stock stock3 = otherFabric.new Stock(70);

        steamship.spin();
        steamship.goDown();
        neznayka.holdHands();
        kozlic.holdHands();
        neznayka.run(steamship.getName());
        kozlic.run(steamship.getName());
        neznayka.miss();
        kozlic.miss();
        znayka.goOut(steamship.getName());
        pilulkin.goOut(steamship.getName());
        vintik.goOut(steamship.getName());
        shpontik.goOut(steamship.getName());
        ponchik.goOut(steamship.getName());
        System.out.println(unknown + " сошли по трапу с " + steamship.getName());
        neznayka.stop();
        neznayka.speak();
        System.out.println(other + " и " + znayka.go(neznayka.getName()));

        firstWorkers.makeWeightlessness();
        firstWorkers.banish("Скуперфильда");
        police.speak();
        secondWorkers.speak();
        thirdWorkers.speak();
        secondWorkers.visit();
        secondWorkers.returned();
        secondWorkers.makeWeightlessness();
        thirdWorkers.brave(true);
        thirdWorkers.makeWeightlessness();
        thirdWorkers.banish("хозяев");
        police.brave(false);
        police.stopped();
        police.kick();
        police.bury();
        police.wear();
        police.work();
        police.tell();
        firstWorkers.earning(stock1.getCost(), 5);
        secondWorkers.earning(stock2.getCost(), 3);
        thirdWorkers.earning(stock3.getCost(), 7);
        try {
            firstWorkers.getSalary();
        } catch (SalaryException e) {
            System.out.println("Неверная зарплата");
        }
        try {
            secondWorkers.getSalary();
        } catch (SalaryException e) {
            System.out.println("Неверная зарплата");
        }
        try {
            thirdWorkers.getSalary();
        } catch (SalaryException e) {
            System.out.println("Неверная зарплата");
        }
        FabricWorkers.Condition condition = new FabricWorkers.Condition();
        condition.getDescription();
        maids.run(richers.getName());
        housemaids.run(richers.getName());
        laundresses.run(richers.getName());
        doormen.run(richers.getName());
        cleaners.run(richers.getName());
        cookmen.run(richers.getName());
        System.out.println(cookmen.prefer() + canteen.getName() + " и " + restaurant.getName());
        System.out.println(cookwomen.prefer() + canteen.getName() + " и " + restaurant.getName());
    }
}