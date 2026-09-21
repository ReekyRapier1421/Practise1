package block1.pract4.seasons;

public enum Season {
    WINTER(-10),
    SPRING(10),
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(5);

    private final int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}






