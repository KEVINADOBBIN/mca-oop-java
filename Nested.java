class Emp {

    String id;
    String name;

    // Constructor for Emp
    Emp(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Inner (nested) class
    class Salary {

        double basic;
        double da;

        // Constructor for Salary
        Salary(double basic) {
            this.basic = basic;
        }

        void display() {
            System.out.println("KEVIN A DOBBIN MCA 'A' SEC\n");
            System.out.println("Employee ID   : " + id);
            System.out.println("Employee Name : " + name);
            System.out.println("Basic Salary  : " + basic);

            da = basic * 0.9;
            System.out.println("Total Salary  : " + (basic + da));
        }
    }
}

public class Nested {
    public static void main(String[] args) {

        Emp e1 = new Emp("1", "St. Francis");
        Emp.Salary s1 = e1.new Salary(10000.0);
        s1.display();
    }
}
