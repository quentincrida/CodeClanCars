public abstract class Car {

    double price;
    String colour;
    int numberOfDoors;
    Tyres tyres;
    GearBox gearBox;

    public Car(double price, String colour, int numberOfDoors, Tyres tyres, GearBox gearBox) {
        this.price = price;
        this.colour = colour;
        this.numberOfDoors = numberOfDoors;
        this.tyres = tyres;
        this.gearBox = gearBox;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public GearBox getGearBox() {
        return gearBox;
    }
}
