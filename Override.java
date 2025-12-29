class Emp {

    String emp_id;
    String name;

    // Constructor
    Emp(String emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;
    }

    // Method to calculate salary (will be overridden)
    void calc_salary(double basic) {
        double da = 0.9 * basic;
        System.out.println("Regular Employee Salary : " + (basic + da));
    }

    // Display method
    void display() {
        System.out.println("Employee ID   : " + emp_id);
        System.out.println("Employee Name : " + name);
    }
}

// Child class
class Emp_Cont extends Emp {

    // Constructor
    Emp_Cont(String emp_id, String name) {
        super(emp_id, name);
    }

    // Overriding calc_salary method
    void calc_salary(double rate) {
        System.out.println("Contractual Employee Salary : " + (20 * rate));
    }
}

public class Override {

    public static void main(String[] args) {

        System.out.println("KEVIN A DOBBIN MCA 'A' SEC\n");

        Emp e1 = new Emp("1", "Kenny");
        Emp_Cont e2 = new Emp_Cont("2", "Cheran");

        e1.display();
        e1.calc_salary(12000.0);

        System.out.println();

        e2.display();
        e2.calc_salary(950.0);
    }
}
