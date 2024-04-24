public class Demo{
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicleObject("Car");
        Vehicle vehicle2 = VehicleFactory.getVehicleObject("Bike");
        Vehicle vehicle3 = VehicleFactory.getVehicleObject(null);
        Vehicle vehicle4 = VehicleFactory.getVehicleObject(null);
        Vehicle vehicle5 = VehicleFactory.getVehicleObject(null);

        printVehicleDetails(vehicle1);
        printVehicleDetails(vehicle2);
        printVehicleDetails(vehicle3);
        printVehicleDetails(vehicle4);
        printVehicleDetails(vehicle5);

      
    }

    private static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
        System.out.println("Fuel Tank Capacity: " + vehicle.getFuelTankCapacity());

    }

   
}