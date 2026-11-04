package StoreManagementSystem;

public abstract class Product {
    String name;
    double price;
    int id;
    double discountRate;

    Product(String name, double price, int id, double discountRate){
        this.name = name;
        this.price = price;
        this.id = id;
        this.discountRate = discountRate;
    }

    void showInfo(){
        System.out.println("ID: "+ id);
        System.out.println("Product name: "+ name);
        System.out.println("Price: "+ price);
        System.out.println("Discount: "+calculateDiscount());
        System.out.println("Final price: "+calculateFinalPrice());
    }

    abstract double calculateDiscount();
    double calculateFinalPrice(){
        return price - (price * discountRate);
    };
}
