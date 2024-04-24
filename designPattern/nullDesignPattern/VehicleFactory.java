
public class VehicleFactory {
    
    static Vehicle getVehicleObject(String typeOfVehicle){
        if("Car".equals(typeOfVehicle)){
            return new Car();
        }

        if("Bike".equals(typeOfVehicle)){
            return new Bike();
        }

        return new NullObject();
    }
    
}
