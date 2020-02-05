import java.util.ArrayList;

public class Dealership {
    private ArrayList<Car> stock;
    private double till;

    public Dealership() {
        stock = new ArrayList<>();
        till = 0;
    }

    public double getTill() {
        return till;
    }

    public int countCars(){
        return this.stock.size();
    }
    public void addCarToStock(Car car){
        this.stock.add(car);
    }
}
