import java.util.ArrayList;


public class Customer {
    private String name;
    private double money;
    private ArrayList<Car> collection;


    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.collection = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public int countCarCollection(){
        return collection.size();

    }

    public void addCarToCollection(Car car){
        collection.add(car);
    }
//    public double canBuyCar(Car car){
//        double this.getMoney() - car.getPrice();
//    }
//    public double removeMoneyFromWallet(){
//        return money -
//    }

}
