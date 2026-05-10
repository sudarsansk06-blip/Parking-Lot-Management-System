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
                System.out.println("Your fees was : "+Payment.getFees(day,p.getVehicletype())+"rs");
                System.out.println("Thank you, we Welcome you Again...");
                System.out.println("--------------------------------------------------------");
            }
        }
        if(bool != true) {
            System.out.println("Sorry! This is an Invalid Token ID...");
        }
    }

}
