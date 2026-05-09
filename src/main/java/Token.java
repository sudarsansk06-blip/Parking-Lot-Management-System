public class Token {
    private VEHICLETYPE vehicletype;
    private ParkingSpot parkingSpot;

    Token(VEHICLETYPE vehicletype, ParkingSpot parkingSpot) {
        this.vehicletype = vehicletype;
        this.parkingSpot = parkingSpot;
        parkingSpot.setTokenId(getTokenId());
    }

    public long getTokenId() {
        return ((long) parkingSpot.getSpotId()) * 25052004 + parkingSpot.getTokenId();
    }
}
