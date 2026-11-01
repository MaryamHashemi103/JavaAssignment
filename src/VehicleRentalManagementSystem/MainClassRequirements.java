package VehicleRentalManagementSystem;

public class MainClassRequirements {
    static void main() {
        Car car = new Car(101, "Toyota", "Camry",80,true, 4, "Hybrid");
        Motorcycle bike = new Motorcycle(102, "Honda", "CBR",30, false, 120 );
        Truck truck = new Truck(103, "Ford", "F150", 120,true, 2.5);

        car.displayInfo();
        System.out.println();
        bike.displayInfo();
        System.out.println();
        truck.displayInfo();
        System.out.println();

        RentalManagement rentVehicle = new RentalManagement("Ali", car, 5);
        rentVehicle.processRental();

        RentalManagement rentVehicle2 = new RentalManagement("Maryam", bike, 3);
        rentVehicle2.processRental();
        System.out.println("-------------------------------------");

        RentalManagement rentVehicle3 = new RentalManagement("MohammadHossein", car, 2);
        rentVehicle.processRental();

        rentVehicle.displayRentalDetails();
        System.out.println();

        rentVehicle.returnRental();
        System.out.println();

        RentalManagement rentVehicle4 = new RentalManagement("Zahra", car, 4);
        rentVehicle4.processRental();

        car.displayInfo();
        System.out.println();
        bike.displayInfo();
        System.out.println();
        truck.displayInfo();
        System.out.println();


        Vehicle vehicles[] = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = bike;
        vehicles[2] = truck;

        for(int i= 0; i < vehicles.length; i++){
            vehicles[i].displayInfo();
            System.out.println("--------------");
        }



    }
}
