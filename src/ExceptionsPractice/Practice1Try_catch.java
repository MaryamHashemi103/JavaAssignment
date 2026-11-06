package ExceptionsPractice;

import java.util.Scanner;

public class Practice1Try_catch {
    static void main() {
        System.out.println("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
         try {
            double  result = num1/num2;
             System.out.println(result);
         }catch (ArithmeticException e){
             System.out.println("Can not be divided to zero");
         }
        System.out.println("Program finished!1");
    }
}
