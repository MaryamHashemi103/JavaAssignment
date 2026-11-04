package StoreManagementSystem;

public interface Sellable {
    double TAX_RATE = 0.09;
    void sell();
    default void showMessage(){
        System.out.println("This product is available for sale");
    }
    static void shopRules(){
        System.out.println("Welcome to our shop");
    }

}
