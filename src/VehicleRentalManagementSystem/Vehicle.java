package VehicleRentalManagementSystem;

public class Vehicle {
    //attributes
    private int vehicleId;
    private String brand;
    private String model;
    private double dailyRate;
    private boolean available;

    //methods
    Vehicle(int vehicleId, String brand, String model, double dailyRate, boolean available){
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.dailyRate = dailyRate;
        this.available = available;
    }

    //setters
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setDailyRate(double dailyRate){
        this.dailyRate = dailyRate;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }

    //getters
    public int getVehicleId(){
        return vehicleId;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getDailyRate() {
        return dailyRate;
    }
    public boolean getAvailable(){
        return available;
    }


    boolean rentVehicle(){
        return available = false;
    }
    boolean returnVehicle(){
        return available = true;
    }
    double calculateRentalCost(int day){ return   day * dailyRate ; }
    void displayInfo(){
        System.out.println("Id: "+ vehicleId);
        System.out.println("Brand: "+ brand);
        System.out.println("Model: "+ model);
        System.out.println("DailyRate: "+ dailyRate);
        System.out.println("Available: "+ available);
    }

}
