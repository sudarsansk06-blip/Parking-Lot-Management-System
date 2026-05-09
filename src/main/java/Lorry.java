import java.util.ArrayList;
import java.util.List;

public class Lorry extends Vehicle {
    Lorry(String numberPlate, VEHICLETYPE vehicletype) {
        super(numberPlate, vehicletype);
    }

    private static List<Lorry> lorries = new ArrayList<>();

    public static void addLorry(Lorry lorry) {
        lorries.add(lorry);
    }

    public static List<Lorry> ParkedlorriesHistory(){
        return lorries;
    }

    @Override
    public String toString() {

        return "| Parked Lorry : "+getNumberPlate()+" |  ";
    }
}
