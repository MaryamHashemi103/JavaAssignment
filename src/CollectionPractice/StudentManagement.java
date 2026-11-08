package CollectionPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    static void main() {
        ArrayList<String> names = new ArrayList<>();
        int choice;
        do{
            System.out.println("Menu------------------");
            System.out.println("1.Add student names");
            System.out.println("2.Display all students");
            System.out.println("3.Search for a student");
            System.out.println("4.Update a student's name");
            System.out.println("5.Remove a student");
            System.out.println("6.Display the number of students");
            System.out.println("7.Exists");
            System.out.println("------------------------");

            System.out.print("Select an option to proceed:");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter a name: ");
                    String newName = input.nextLine();
                    names.add(newName);
                    System.out.println("Adding was successful");
                    break;
                case 2 :
                    if(names.isEmpty()) System.out.println("No student found!");
                    else{
                        System.out.println("Students: ");
                        System.out.println(names);
                    }
                    break;
                case 3 :
                    String searchName = input.nextLine();
                    if(names.contains(searchName)){
                        System.out.println("Student found.");
                    }
                    else{
                        System.out.println("Student not found!");
                    }
                    break;
                case 4 :
                    System.out.println("New name: ");
                    String updateName = input.next();
                    System.out.println("Index of name you want to change: ");
                    int indexName = input.nextInt();
                    names.set(indexName, updateName);
                    break;
                case 5 :
                    System.out.println("Before removing : "+ names);
                    System.out.println("Index of name you want to remove: ");
                    int indexRemove = input.nextInt();
                    names.remove(indexRemove);
                    System.out.println("After removing : "+ names);
                    break;
                case 6 :
                    System.out.println("Number of students: ");
                    System.out.println(names.size());
                    break;
                case 7 :
                    System.out.println("Exists");
                    break;
                default:
                    System.out.println("Invalid choice! ");
            }
        }while(choice  == 7);


    }
}
