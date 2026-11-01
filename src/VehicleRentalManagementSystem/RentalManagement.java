package VehicleRentalManagementSystem;

public class RentalManagement {
    String customerName;
    Vehicle vehicle;
    int rentalDays;
    double totalCost;

    RentalManagement(String customerName, Vehicle vehicle, int rentalDays){
        this.customerName = customerName;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
    }

    //methods
    void processRental(){
        if(this.rentalDays <= 0 ){
            System.out.println("Rental days can not be 0 or negative!");
            return;
        }
        if(this.vehicle.getAvailable()){
            this.totalCost = this.vehicle.calculateRentalCost(this.rentalDays);

            this.vehicle.setAvailable(false);
            System.out.println("Total rental cost for "+ this.vehicle.getBrand()+ ":"+ this.totalCost);
            System.out.println("Rental process was successful for "+ this.customerName);
        }
        else{
            System.out.println("This vehicle is not available for renting!");
        }
    }

    void returnRental(){
        if(!vehicle.getAvailable()){
            vehicle.setAvailable(true);
            System.out.println("The vehicle returned successfully");
        }
        else{
            System.out.println("This vehicle is already available or it does not belong to our system! ");
        }
    }
    void displayRentalDetails(){
        System.out.println("Rental Information------------------");
        System.out.println("Customer name: "+ this.customerName);
        System.out.println("Vehicle info: ");
        this.vehicle.displayInfo();
        System.out.println("Rental days: "+ this.rentalDays);
        System.out.println("Total cost: "+ this.totalCost);
    }
}
