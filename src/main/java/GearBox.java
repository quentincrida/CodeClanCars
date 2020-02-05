public class GearBox {
    private int numberOfGears;
    private String transmission;

    public GearBox(int numberOfGears, String transmission) {
        this.numberOfGears = numberOfGears;
        this.transmission = transmission;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public String getTransmission() {
        return transmission;
    }
}
