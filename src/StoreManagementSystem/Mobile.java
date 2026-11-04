package StoreManagementSystem;

public class Mobile extends Product implements Sellable{
    Mobile(String name, double price, int id, double discountRate){
        super(name, price, id, discountRate);
    }
    @Override
    double calculateDiscount(){
        return price * discountRate;
    }
    @Override
    public void sell(){
        System.out.println("Mobile is being sold");
    }
}
