public class ElectricCar extends Car {

    private ElectricEngine engine;

    public ElectricCar(double price, String colour, int numberOfDoors, Tyres tyres, GearBox gearBox, ElectricEngine engine) {
        super(price, colour, numberOfDoors, tyres, gearBox);
        this.engine = engine;
    }

    public ElectricEngine getEngine() {
        return engine;
    }
}
