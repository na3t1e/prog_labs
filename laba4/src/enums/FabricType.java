package enums;

public enum FabricType {
    SCAPERFIELDS("скуперфильдовские"), OTHER_FACTORIES("других фабрик"), SOME_FACTORIES("некоторых фабрик");
    private String name;

    FabricType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

