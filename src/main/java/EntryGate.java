public class EntryGate {

    public static void needToPark(String vehicleNo, VEHICLETYPE vehicletype, ParkingFloor parkingFloor) {

        for (ParkingSpot p : parkingFloor.getParkingSpot()) {
            if (p.getVehicletype() == vehicletype && p.getIsAvailable() == ISAVAILABLE.AVAILABLE) {
                Token token = new Token(vehicletype, p);
                System.out.println("--------------------------------------------------------");
                System.out.println(vehicletype + " Parking is AVAILABLE");
                System.out.println("Park your, " + vehicletype + " in SPOT_ID = " + p.getSpotId());
                System.out.println("This is your Token id : " + token.getTokenId());
                System.out.println("Token id is requested when you take the "+vehicletype+" from Parking!");
                System.out.println("Don't worry, We protect your " + vehicletype + ", Thank you...");
                System.out.println("--------------------------------------------------------");
                System.out.println();
                p.setTokenId(token.getTokenId());
                p.setIsAvailable(ISAVAILABLE.PARKED);
                p.setVehicleNo(vehicleNo);
                return;
            }
        }
        System.out.println("--------------------------------------------------------");
        System.out.println(vehicletype + " Parking is NOT AVAILABLE");
        System.out.println("--------------------------------------------------------");
        System.out.println();
    }
}
