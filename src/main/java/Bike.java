import java.util.ArrayList;
import java.util.List;

public class Bike extends Vehicle {
    Bike(String numberPlate, VEHICLETYPE vehicletype) {
        super(numberPlate, vehicletype);
    }

    private static List<Bike> bikes = new ArrayList<>();

    public static void addBike(Bike bike) {
        bikes.add(bike);
    }

    public static List<Bike> ParkedBikesHistory(){
        return bikes;
    }

    @Override
    public String toString() {

        return "| Parked Bike : "+getNumberPlate()+" |  ";
    }
}
