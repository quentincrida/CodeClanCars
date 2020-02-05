public class HybridCar extends Car {
    private HybridEngine hybridEngine;

    public HybridCar(double price, String colour, int numberOfDoors, Tyres tyres, GearBox gearBox, HybridEngine hybridEngine) {
        super(price, colour, numberOfDoors, tyres, gearBox);
        this.hybridEngine = hybridEngine;
    }

    public HybridEngine getEngine() {
        return hybridEngine;
    }
}
