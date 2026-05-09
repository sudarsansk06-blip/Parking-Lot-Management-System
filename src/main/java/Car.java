import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
    Car(String numberPlate, VEHICLETYPE vehicletype) {
        super(numberPlate, vehicletype);
    }

    private static List<Car> cars = new ArrayList<>();

    public static void addCar(Car car) {
        cars.add(car);
    }

    public static List<Car> ParkedCarsHistory(){
        return cars;
    }

    @Override
    public String toString() {

        return "| Parked Car : "+getNumberPlate()+" |  ";
    }

}


