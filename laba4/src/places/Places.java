package places;

public abstract class Places {
        private String name;

        public Places(String name) {
                this.name = name;
        }

        public String getName() {
                return name;
        }
}
