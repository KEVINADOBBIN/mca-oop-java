class Student {

    String uucms;
    String name;
    int marks1;
    int marks2;
    int marks3;
    float percentage;

    // Constructor
    Student(String uucms, String name, int marks1, int marks2, int marks3) {
        this.uucms = uucms;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.percentage = (marks1 + marks2 + marks3) / 3.0f;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("UUCMS      : " + uucms);
        System.out.println("Name       : " + name);
        System.out.println("Marks 1    : " + marks1);
        System.out.println("Marks 2    : " + marks2);
        System.out.println("Marks 3    : " + marks3);
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("-----------------------------------");
    }
}

// Main class
public class StudentMain {

    public static void main(String[] args) {

        System.out.println("KEVIN A DOBBIN MCA 'A' SEC\n");

        // Array of 5 Student objects
        Student[] students = new Student[5];

        students[0] = new Student("UUCMS1", "Naveen", 50, 78, 93);
        students[1] = new Student("UUCMS2", "Raghu", 65, 58, 55);
        students[2] = new Student("UUCMS3", "Manu", 68, 87, 56);
        students[3] = new Student("UUCMS4", "Punith", 85, 91, 95);
        students[4] = new Student("UUCMS5", "Manohar", 90, 87, 85);

        // Loop through the array and display each student's details
        for (int i = 0; i < students.length; i++) {
            students[i].displayDetails();
        }
    }
}
