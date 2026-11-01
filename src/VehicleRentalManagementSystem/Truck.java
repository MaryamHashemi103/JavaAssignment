package VehicleRentalManagementSystem;

public class Truck extends Vehicle{
    private double loadCapacity;
    Truck(int vehicleId, String brand, String model, double dailyRate, boolean available, double loadCapacity) {
        super(vehicleId, brand, model, dailyRate, available);
    }

    @Override
    double calculateRentalCost(int day){
        double mainCost = super.calculateRentalCost(day);
        return mainCost + 50;
    }
    @Override
    void displayInfo(){
        System.out.println("Category: Truck");
        System.out.println("Id: "+ getVehicleId());
        System.out.println("Brand: "+ getBrand());
        System.out.println("Model: "+ getModel());
        System.out.println("DailyRate: "+ getDailyRate());
        System.out.println("Available: "+ getAvailable());
    }
}
