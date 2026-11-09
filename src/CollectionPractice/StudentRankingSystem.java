package CollectionPractice;

import java.lang.reflect.Array;
import java.util.TreeSet;
import java.util.Scanner;
public class StudentRankingSystem {
    static void main(){
        TreeSet<Double> grades = new TreeSet<>();
        Scanner input = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("\nMenu ----------------------------");
            System.out.println("1. Add grade: ");
            System.out.println("2. Display Sorted grades (High to Low): ");
            System.out.println("3. Highest grade: ");
            System.out.println("4. Lowest grade: ");
            System.out.println("5. Nearest grade Below from 80: ");
            System.out.println("6. Nearest grade above from 80: ");
            System.out.println("7. Exit");
            System.out.println("----------------------------------");
            System.out.print("Choose an option :");
            choice = input.nextInt();
            input.nextLine();
            switch(choice){
                case 1 :
                    System.out.print("Enter a grade:");
                    double grade = input.nextDouble();
                    if(grade < 0 || grade > 100){
                        System.out.println("Invalid Score!");
                    }
                    else{
                        grades.add(grade);
                        System.out.println("Added successfully!");
                    }
                    break;
                case 2 :
                    System.out.print("Sorted grades : ");
                    for(double sortedGrade : grades.descendingSet()){
                        System.out.print(sortedGrade + " , ");
                    }
                    break;
                case 3 :
                    System.out.print("Highest grade: ");
                    System.out.println(grades.last());
                    break;
                case 4 :
                    System.out.print("Lowest garde: ");
                    System.out.println(grades.first());
                    break;
                case 5 :
                    System.out.print("Nearest Below from 80: ");
                    System.out.println(grades.floor(80.0));
                    break;
                case 6 :
                    System.out.print("Nearest above from 80:");
                    System.out.print(grades.ceiling(80.0));
                    break;
                case 7 :
                    System.out.println("Exit");
                    break;
                default :
                    System.out.println("Invalid entry!!");
            }
        }while(choice != 7);
    }
}
