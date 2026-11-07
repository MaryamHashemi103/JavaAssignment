package ExceptionsPractice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice7Catch_try_finally {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number: ");

        try{
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            double  division = num1/num2;
            System.out.println(num1 + "/"+ num2+ " = "+ division);
        }catch (InputMismatchException e){
            System.out.println("Please enter only the number!");
        }catch (ArithmeticException e){
            System.out.println("Numbers can not be divided to zero!");
        }finally{
            System.out.println("End of calculating.");
        }
    }
}
