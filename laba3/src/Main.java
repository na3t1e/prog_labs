import workes.FirstWorkers;
import police.Police;
import workes.SecondWorkers;
import workes.ThirdWorkers;
import enums.FabricType;
import workes.Workers;

public class Main {
    public static void main(String[] args) {
        Police police = new Police("Полицейские");
        Workers firstWorkers = new FirstWorkers(FabricType.SCAPERFIELDS, true);
        SecondWorkers secondWorkers = new SecondWorkers(FabricType.OTHER_FACTORIES, true);
        ThirdWorkers thirdWorkers = new ThirdWorkers(FabricType.SOME_FACTORIES, false);

        firstWorkers.makeWeightlessness();
        ((FirstWorkers) firstWorkers).banish("Скуперфильда");
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