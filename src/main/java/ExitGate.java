import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ExitGate {
    private static int id = 1;
    public static void needToExit(long tokenId, ParkingFloor parkingFloor,String day) {
        boolean bool = false;
        for (ParkingSpot p : parkingFloor.getParkingSpot()) {
            if (tokenId == p.getTokenId()) {
                bool = true;
                p.setIsAvailable(ISAVAILABLE.AVAILABLE);
                p.setTokenId(id++);
                p.setVehicleNo("No Vehicle");
                System.out.println("--------------------------------------------------------");
                System.out.println("Your fees was : "+calculateFees(day,p.getVehicletype())+"rs");
                System.out.println("Thank you, we Welcome you Again...");
                System.out.println("--------------------------------------------------------");
            }
        }
        if(bool != true) {
            System.out.println("Sorry! This is an Invalid Token ID...");
        }
    }
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
}
