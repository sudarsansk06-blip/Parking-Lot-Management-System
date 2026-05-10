import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main() {
        ParkingFloor parkingFloor1 = ParkingFloor.getInstance();

        parkingFloor1.addParkingSpot(0, VEHICLETYPE.BIKE, ISAVAILABLE.AVAILABLE, "No Vehicle");
        parkingFloor1.addParkingSpot(1, VEHICLETYPE.CAR, ISAVAILABLE.AVAILABLE, "No Vehicle");
        parkingFloor1.addParkingSpot(2, VEHICLETYPE.LORRY, ISAVAILABLE.AVAILABLE, "No Vehicle");
        parkingFloor1.addParkingSpot(3, VEHICLETYPE.BIKE, ISAVAILABLE.AVAILABLE, "No Vehicle");
        parkingFloor1.addParkingSpot(4, VEHICLETYPE.CAR, ISAVAILABLE.AVAILABLE, "No Vehicle");
        parkingFloor1.addParkingSpot(5, VEHICLETYPE.LORRY, ISAVAILABLE.AVAILABLE, "No Vehicle");


        //parkingFloor1.needtopark(VEHICLETYPE.CAR, parkingFloor1);
        //parkingFloor1.needtopark(VEHICLETYPE.CAR, parkingFloor1);

        Scanner scan = new Scanner(System.in);

        System.out.println("--------------------------------------------------------");
        System.out.println("Hi Welcome to our Parking Spot...");
        System.out.println("--------------------------------------------------------");
        System.out.println();
        boolean bool = true;

        while (bool == true) {
            System.out.println("--------------------------------------------------------");
            System.out.println("Please select the option below!");
            System.out.println("1. Show Parking Spots");
            System.out.println("2. Show Available Parking Spots");
            System.out.println("3. Need to Park Bike");
            System.out.println("4. Need to Park Car");
            System.out.println("5. Need to Park Lorry");
            System.out.println("6. Need to take Vehicle");
            System.out.println("7. Exit");
            System.out.println("--------------------------------------------------------");
            System.out.println();


            System.out.print("Please enter the number : ");
            try {
                int n = scan.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("--------------------------------------------------------");
                        System.out.println("These are our Parking Spots");
                        System.out.println();
                        System.out.println(parkingFloor1.getParkingSpot());
                        System.out.println("--------------------------------------------------------");
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("--------------------------------------------------------");
                        System.out.println("These are our Available Parking Spots!");
                        System.out.println();
                        System.out.println(parkingFloor1.getAvailableParkingSpot());
                        System.out.println("--------------------------------------------------------");
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Enter the vechile number : ");
                        String vehicleNo = scan.next();

                        if (parkingFloor1.checkVNO(vehicleNo)) {
                            VEHICLETYPE vehicletype = VEHICLETYPE.BIKE;
                            Vehicle vehicle = new Bike(vehicleNo, vehicletype);
                            Bike bike = (Bike) vehicle;
                            Bike.addBike(bike);
                            ParkingFloor.needtopark(vehicleNo, vehicletype, parkingFloor1);
                        } else {
                            System.out.println("This Vechile Number is Already Parked...");
                        }
                        break;
                    case 4:
                        System.out.println("Enter the vechile number : ");
                        String vehicleNoC = scan.next();
                        if (parkingFloor1.checkVNO(vehicleNoC)) {
                            VEHICLETYPE vehicleC = VEHICLETYPE.CAR;
                            Vehicle vehicleCar = new Car(vehicleNoC, vehicleC);
                            Car car = (Car) vehicleCar;
                            Car.addCar(car);
                            ParkingFloor.needtopark(vehicleNoC, vehicleC, parkingFloor1);
                        } else {
                            System.out.println("This Vechile Number is Already Parked...");
                        }
                        break;
                    case 5:
                        System.out.println("Enter the vechile number : ");
                        String vehicleNoL = scan.next();
                        if (parkingFloor1.checkVNO(vehicleNoL)) {
                            VEHICLETYPE vehicleL = VEHICLETYPE.LORRY;
                            Vehicle vehicleLorry = new Lorry(vehicleNoL, vehicleL);
                            Lorry lorry = (Lorry) vehicleLorry;
                            Lorry.addLorry(lorry);
                            ParkingFloor.needtopark(vehicleNoL, vehicleL, parkingFloor1);
                        } else {
                            System.out.println("This Vechile Number is Already Parked...");
                        }
                        break;
                    case 6:
                        try {
                            System.out.println("Enter the parked Date : (YYYY-MM-DD)");
                            String day = scan.next();
                            LocalDate today = LocalDate.parse(day);
                            LocalDate date = LocalDate.now();
                            if (today.isAfter(date)) {
                                System.out.println("Invalid Date!...");
                                break;
                            }
                            System.out.println("Enter the Token Id : ");
                            long tokenId = scan.nextLong();
                            ParkingFloor.needToExit(tokenId, parkingFloor1, day);
                        } catch (Exception e) {
                            System.out.println("Invalid date");
                        }

                        break;
                    case 7:
                        System.out.println("Thank You!");
                        bool = false;
                        break;
                    default:
                        System.out.println("You have entered an Invalid Number!");
                }

            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Please, Enter only Numbers (eg : 1,2,3...)");
                scan.nextLine();
            }
        }
    }
}
