package ExceptionsPractice;

import java.util.Scanner;

public class Practice5_catch_try {
    static void main() {
        String product[] = new String[3];
        product[0] = "Book";
        product[1] = "Pen";
        product[2] = "Notebook";

        Scanner input = new Scanner(System.in);
        System.out.println("Product Id: ");
        int num_product = input.nextInt();
        try {
            System.out.println(product[num_product]+ "  found ");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Product not found!");
        }
        System.out.println("The end");
    }
}
