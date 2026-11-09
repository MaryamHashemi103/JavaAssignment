package CollectionPractice;
import java.util.Scanner;
import java.util.TreeSet;

public class NumberSortingSystem {
    static void main() {
        TreeSet<Integer> numbers = new TreeSet<>();
        Scanner input = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("Menue------------------------");
            System.out.println("1. Add a number: ");
            System.out.println("2. Display ascending order: ");
            System.out.println("3. Display descending order: ");
            System.out.println("4. Find the smallest number: ");
            System.out.println("5. Find the largest number: ");
            System.out.println("6. Nearest grade Below from 30 :");
            System.out.println("7. Nearest grade above from 30 : ");
            System.out.println("8. Exit");
            System.out.println("------------------------------");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            switch(choice){
                case 1 :
                    System.out.print("Enter a number: ");
                    int num = input.nextInt();
                    if(num < 0){
                        System.out.println("Please enter an Integer !");
                    }
                    else{
                        numbers.add(num);
                        System.out.println("Added successfully");
                    }
                    break;
                case 2 :
                    System.out.println("Ascending order: ");
                    for(int nums : numbers){
                        System.out.print(nums + " ,");
                    }
                    break;
                case 3 :
                    System.out.print("Descending order: ");
                    for(int number : numbers.descendingSet()){
                        System.out.print(number + " , ");
                    }
                    break;
                case 4 :
                    System.out.print("Smallest number: ");
                    System.out.println(numbers.first());
                    break;
                case 5 :
                    System.out.print("Largest number: ");
                    System.out.println(numbers.last());
                    break;
                case 6 :
                    System.out.print("Nearest Below from 30 : ");
                    System.out.println(numbers.floor(30));
                    break;
                case 7 :
                    System.out.print("Nearest above from 30 :");
                    System.out.print(numbers.ceiling(30));
                    break;
                case 8 :
                    System.out.println("Exit");
                    break;
                default :
                    System.out.println("Invalid entry!!");
            }
        }while(choice != 8);

    }
}
