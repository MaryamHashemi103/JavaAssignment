package ExceptionsPractice;

import java.util.Scanner;

public class Practice2Try_catch_finally {
    static void main() {
        int balance = 2000;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of people who you want to divide the balance:  ");
        int count_people = input.nextInt();
        try{
            double share_of_eachPerson = balance/count_people;
            System.out.println("Share of each person from this balance: "+ share_of_eachPerson);
        }catch (ArithmeticException e){
            System.out.println("Number of people can not be negative!");
        }

    }
}
