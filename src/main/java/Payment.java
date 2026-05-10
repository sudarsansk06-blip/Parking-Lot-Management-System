import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Payment {
    private static long calculateFees(String day, VEHICLETYPE vehicletype){
        LocalDate today = LocalDate.parse(day);
        LocalDate date = LocalDate.now();
        if(today.isAfter(date)){
            System.out.println("Invalid Date!...");
        }
        long Days = ChronoUnit.DAYS.between(today,date);
        long amount = 0;
        if(vehicletype == VEHICLETYPE.BIKE) {
            amount =  Days * 20;
        }
        else if(vehicletype == VEHICLETYPE.CAR){
            amount =  Days*100;
        } else if (vehicletype == VEHICLETYPE.LORRY) {
            amount =  Days*500;
        }
        return amount;
    }

    public static long getFees(String day, VEHICLETYPE vehicletype){
        return calculateFees(day,vehicletype);
    }
}
