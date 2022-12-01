import entity.FirstWorkers;
import entity.Police;
import entity.SecondWorkers;
import entity.ThirdWorkers;
import other.FabricType;

public class Main {
    public static void main(String[] args) {
        Police police = new Police("Полицейские");
        FirstWorkers firstWorkers = new FirstWorkers(FabricType.СКУПЕРФИЛЬДОВСКИЕ, true);
        SecondWorkers secondWorkers = new SecondWorkers(FabricType.ДРУГИХ_ФАБРИК, true);
        ThirdWorkers thirdWorkers = new ThirdWorkers(FabricType.НЕКОТОРЫХ_ФАБРИК, false);

        firstWorkers.makeWeightlessness();
        firstWorkers.banish("Скуперфильда");
        police.tellAbout();
        secondWorkers.tellAbout();
        thirdWorkers.tellAbout();
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
    }
}