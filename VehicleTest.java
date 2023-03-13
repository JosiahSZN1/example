// Getters, Setters & Access Modifiers
    // Getters and Setters
class VehicleTest {
    public static void main(String[] args) {
        // Vehicle bike = new Vehicle();
        // Vehicle car = new Vehicle();
        // bike.setNumberOfWheels(2);
        // bike.setColor("red");
        // int bikeWheels = bike.getNumberOfWheels();
        // String bikeColor = bike.getColor();
        // car.setNumberOfWheels(4);
        // car.setColor("green");
        // int carWheels = car.getNumberOfWheels();
        // String carColor = car.getColor();
        // System.out.println("Bike object - Wheels: " + bikeWheels + ", Color: " + bikeColor);
        // System.out.println("Car object - Wheels: " + carWheels + ", Color: " + carColor);

// Constructors and Overloading
        Vehicle redVehicle = new Vehicle("red");
        String color = redVehicle.getColor();
        System.out.println("The Vehicle color is: " + color);
        Vehicle secondVehicle = new Vehicle();
        Vehicle blueVehicle = new Vehicle("blue",4);
        String colorBlueVehicle = blueVehicle.getColor();
        System.out.println("The Vehicle color is: " + colorBlueVehicle);
        int numWheelsBlueVehicle = blueVehicle.getNumberOfWheels();
        System.out.println("The Vehicle has " + numWheelsBlueVehicle + " wheels.");
    }
}

