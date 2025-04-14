public class Lasagna {
    private static final int EXPECTED_OVEN_TIME = 40;

    public int expectedMinutesInOven() {
        return EXPECTED_OVEN_TIME;
    }

    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;

    }

    public int totalTimeInMinutes(int layers, int actualMinutesInOven) {
        return preparationTimeInMinutes(layers) + actualMinutesInOven;
    }
}
