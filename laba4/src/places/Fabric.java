package places;

import enums.FabricType;

public class Fabric extends Places {
    private FabricType type;

    public Fabric(String name, FabricType type) {
        super(name);
        this.type = type;
    }

    public class Stock {
        private int cost;

        public Stock(int changing) {
            if (type == FabricType.SCAPERFIELDS) {
                cost = 10 + changing;
            } else if (type == FabricType.OTHER_FACTORIES) {
                cost = 50 + changing;

            } else {
                cost = 70 + changing;
            }
        }

        public int getCost() {
            return cost;
        }

        public String[] getSupplies() {
            if (type == FabricType.SCAPERFIELDS) {
                return new String[]{"масло", "хлеб"};
            } else if (type == FabricType.OTHER_FACTORIES) {
                return new String[]{"макароны", "пельмени"};


            } else {
                return new String[]{"мясо", "фрукты"};

            }
        }


    }
}
