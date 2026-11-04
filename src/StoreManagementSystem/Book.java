package StoreManagementSystem;

public class Book extends Product implements Sellable{
    Book(String name, double price, int id, double discountRate){
        super(name, price, id, discountRate);
    }
    @Override
    double calculateDiscount(){
        return  price * discountRate;
    }
    @Override
    public void sell(){
        System.out.println("Book is being sold");
    }
}
