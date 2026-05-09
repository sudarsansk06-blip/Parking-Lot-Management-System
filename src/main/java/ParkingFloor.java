import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ParkingFloor {
    private List<ParkingSpot> ParkingSpot = new ArrayList<>();

    private static ParkingFloor parkingFloor1 = new ParkingFloor();
    private ParkingFloor(){
        System.out.println("Object Created");
    }

    public static ParkingFloor getInstance(){
        return parkingFloor1;
    }

    //Getters
    public List<ParkingSpot> getParkingSpot() {
        return ParkingSpot;
    }

    public List<ParkingSpot> getAvailableParkingSpot() {
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        ListIterator<ParkingSpot> iterator = ParkingSpot.listIterator();
        while (iterator.hasNext()){
            ParkingSpot p = iterator.next();
            if(p.getIsAvailable() == ISAVAILABLE.AVAILABLE){
                parkingSpots.add(p);
            }
        }
        return parkingSpots;
    }


    //Methods

    //TO_PARK
    public static void needtopark(String vehicleNo,VEHICLETYPE vehicletype,ParkingFloor parkingFloor) {
        EntryGate.needToPark(vehicleNo,vehicletype, parkingFloor);
    }

    //TO_EXIT
    public static void needToExit(long tokenId, ParkingFloor parkingFloor){
        ExitGate.needToExit(tokenId,parkingFloor);
    }
    //Setters
    public void addParkingSpot(int spotId, VEHICLETYPE vehicletype, ISAVAILABLE isAvailable,String vehicleNo) {
        ParkingSpot parkingSpot = new ParkingSpot(spotId, vehicletype, isAvailable,vehicleNo);
        ParkingSpot.add(parkingSpot);
    }

    //CHECKvNO
    public boolean checkVNO(String vehicleNo){
        for(ParkingSpot p : getParkingSpot()){
            if(p.getvehicleNo().equals(vehicleNo)){
                return false;
            }
        }
        return true;
    }


}
