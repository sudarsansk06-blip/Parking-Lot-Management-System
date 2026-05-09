public class Vehicle {
    private String numberPlate;
    private VEHICLETYPE vehicleType;

    Vehicle(String numberPlate, VEHICLETYPE vehicleType) {
        this.numberPlate = numberPlate;
        this.vehicleType = vehicleType;
    }

    //Getters
    public String getNumberPlate(){
        return numberPlate;
    }

    public VEHICLETYPE getVehicleType(){
        return vehicleType;
    }
}
