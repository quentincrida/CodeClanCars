public class PetrolCar extends Car {

    private PetrolEngine petrolEngine;

    public PetrolCar(double price, String colour, int numberOfDoors, Tyres tyres, GearBox gearBox, PetrolEngine petrolEngine) {
        super(price, colour, numberOfDoors, tyres, gearBox);
        this.petrolEngine = petrolEngine;
    }

    public PetrolEngine getEngine() {
        return petrolEngine;
    }
}
