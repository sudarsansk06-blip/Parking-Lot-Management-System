public class ParkingSpot {
    private int spotId;
    private VEHICLETYPE vehicletype;
    private ISAVAILABLE isAvailable;
    private long tokenId;
    private String vehicleNo;

    ParkingSpot(int spotId, VEHICLETYPE vehicletype, ISAVAILABLE isAvailable,String vehicleNo) {
        this.vehicletype = vehicletype;
        this.spotId = spotId;
        this.isAvailable = isAvailable;
        this.vehicleNo = vehicleNo;
        this.tokenId = spotId*10;
    }

    //Getters
    public VEHICLETYPE getVehicletype() {
        return vehicletype;
    }

    public int getSpotId() {
        return spotId;
    }

    public ISAVAILABLE getIsAvailable() {
        return isAvailable;
    }

    public long getTokenId(){
        return tokenId;
    }

    public String getvehicleNo(){
        return vehicleNo;
    }

    //Setters
    public void setIsAvailable(ISAVAILABLE isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setTokenId(long tokenId){
        this.tokenId = tokenId;
    }

    public void setVehicleNo(String vehicleNo){
        this.vehicleNo = vehicleNo;
    }

    @Override
    public String toString() {
        return "--------------------------------\n" + " |              \n" + " |     spotId : " + spotId + "     \n" + " |     vehicletype : " + vehicletype + "     \n" + " |     isAvailable : " + isAvailable + "     \n" + " |     VehicleNo : " + vehicleNo + "     \n" + " |              \n" + " --------------------------------\n";

    }
}

