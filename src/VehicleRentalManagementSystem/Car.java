package VehicleRentalManagementSystem;

public class Car extends Vehicle{
    int numberOfDoors;
    String fuelType;

    Car(int vehicleId, String brand, String model, double dailyRate, boolean available, int numberOfDoors, String fuelType) {
        super(vehicleId, brand, model, dailyRate, available);
    }
    @Override
    double calculateRentalCost(int day){
        double mainCost = super.calculateRentalCost(day);
        return mainCost + (0.1 * mainCost);
    }
    @Override
    void displayInfo(){
        System.out.println("Category: Car");
        System.out.println("Id: "+ getVehicleId());
        System.out.println("Brand: "+ getBrand());
        System.out.println("Model: "+ getModel());
        System.out.println("DailyRate: "+ getDailyRate());
        System.out.println("Available: "+ getAvailable());
    }
}
