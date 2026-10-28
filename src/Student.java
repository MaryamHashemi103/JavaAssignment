public class Student {
    // variables
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {    //constructor with parameter
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void displayInfo() {                             //method
        System.out.println("Name:" + name + " age:" + age + " grade" + grade);
    }

    boolean isPassed(double score) {                //method
        if (score >= 50) return true;
        else return false;
    }

    Student() {                                     //constructor without parameter
        name = "Unknown";
        age = 0;
        grade = 0;
    }

    double getGrade() {                              //method
        return grade;
    }

    String isExcellent(double grade) {               //method
        if (grade >= 90) {
            return "Excellent student";
        }
        else return "Good student";
    }
}
