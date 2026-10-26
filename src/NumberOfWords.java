import java.util.Arrays;
import java.util.Scanner;

public class NumberOfWords {
    static void main() {
       Scanner input= new Scanner(System.in);
       System.out.print("Write your string:");
       String str= input.nextLine(); // taking string from user
       String words[]= str.split(" "); // creating an array from words
       int numberOfWords = words.length ; // counting length of array
       System.out.println("Number of words: "+numberOfWords);
    }
}
