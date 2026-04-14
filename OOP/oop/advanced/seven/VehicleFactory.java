package advanced.seven;

public class VehicleFactory {
    public Vehicle getVehicle(String type){
        if(type == null || type.isEmpty()){
            throw new IllegalArgumentException("The type can't be null or empty");
        }
        return switch(type.toLowerCase()){
            case "car" -> new Car();
            case "truck" -> new Truck();
            case "bike" -> new Bike();
            default -> throw new IllegalArgumentException("Invalid type");
        };
    }
}
