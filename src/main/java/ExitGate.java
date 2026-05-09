import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ExitGate {
    private static int id = 1;
    public static void needToExit(long tokenId, ParkingFloor parkingFloor) {
        boolean bool = false;
        for (ParkingSpot p : parkingFloor.getParkingSpot()) {
            if (tokenId == p.getTokenId()) {
                bool = true;
                p.setIsAvailable(ISAVAILABLE.AVAILABLE);
                p.setTokenId(id++);
                p.setVehicleNo("No Vehicle");
                System.out.println("--------------------------------------------------------");
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
        long Days = ChronoUnit.DAYS.between(today,date);
        if(vehicletype == VEHICLETYPE.BIKE) {
            return Days * 20;
        }
        else if(vehicletype == VEHICLETYPE.CAR){
            return Days*100;
        } else if (vehicletype == VEHICLETYPE.LORRY) {
            return Days*500;
        }
        return Days;
    }
}
