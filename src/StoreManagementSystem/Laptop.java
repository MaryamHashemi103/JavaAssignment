package StoreManagementSystem;

public class Laptop extends Product implements Sellable{
    Laptop(String name, double price, int id, double discountRate){
        super(name, price, id, discountRate);
    }
    @Override
    double calculateDiscount(){
        return price * discountRate;
    }
    @Override
    public void sell(){
        System.out.println("Laptop is being sold");
    }
}
