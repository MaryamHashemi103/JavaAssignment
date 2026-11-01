package VehicleRentalManagementSystem;

public class Motorcycle extends Vehicle{
    private int enginCC;
    Motorcycle(int vehicleId, String brand, String model, double dailyRate, boolean available, int enginCC) {
        super(vehicleId, brand, model, dailyRate, available);
    }

    @Override
    double calculateRentalCost(int day) {
        double mainCost = super.calculateRentalCost(day);
        return mainCost + (0.5 * mainCost);
    }
    @Override
    void displayInfo(){
        System.out.println("Category: Motorcycle");
        System.out.println("Id: "+ getVehicleId());
        System.out.println("Brand: "+ getBrand());
        System.out.println("Model: "+ getModel());
        System.out.println("DailyRate: "+ getDailyRate());
        System.out.println("Available: "+ getAvailable());
    }
}
