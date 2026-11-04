package StoreManagementSystem;

public class Main {
    static void main() {
        Book book = new Book("Java book", 200, 1,0.10);
        Laptop laptop = new Laptop("mac", 2000, 2, 0.15);
        Mobile mobile = new Mobile("Apple", 1000, 3, 0.05);

        book.showInfo();
        book.sell();
        System.out.println();
      //  System.out.println(book.calculateDiscount());
        laptop.showInfo();
        laptop.sell();
        System.out.println();
        mobile.showInfo();
        mobile.sell();
        System.out.println();

        Sellable.shopRules();


    }
}
