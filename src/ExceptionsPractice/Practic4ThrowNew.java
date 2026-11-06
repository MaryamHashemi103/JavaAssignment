package ExceptionsPractice;

import java.util.Scanner;

public class Practic4ThrowNew {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        {

        }
        try {
            int set_age = input.nextInt();

            if(set_age <= 0 || set_age>150){
                throw new IllegalArgumentException("Invalid age");
            }
            System.out.println("Your age is: "+ set_age);
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());

        }

    }
}
