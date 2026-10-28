public class RunStudentClass {
    static void main() {
        Student stu1= new Student("Ali", 29, 99); // creating object
        Student stu2= new Student("Maryam", 22, 98.98); // creating object
        stu1.displayInfo();                                              //calling method
        boolean status1= stu1.isPassed(99);
        System.out.println(status1);
        System.out.println(stu1.isExcellent(99));
        System.out.println();

        stu2.displayInfo();                                              // calling method
        boolean status2= stu2.isPassed(98.98);
        System.out.println(status2);
        System.out.println(stu2.isExcellent(98.98));
    }
}
