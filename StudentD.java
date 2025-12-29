class Student
{
    int reg_no;
    String name;
    String course;

    void set(int id, String nm, String cour)
    {
        reg_no = id;
        name = nm;
        course = cour;
    }

    void display()
    {
        System.out.println("STUDENT DETAILS ARE:");
        System.out.println("Reg No : " + reg_no);
        System.out.println("Name   : " + name);
        System.out.println("Course : " + course);
        System.out.println();
    }
}

class StudentD
{
    public static void main(String args[])
    {
        System.out.println("KEVIN A DOBBIN MCA 'A' SEC\n");

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.set(146, "Kevin", "BCA");
        s2.set(156, "Anthony", "MCA");
        s3.set(166, "Ram", "BCA");

        s1.display();
        s2.display();
        s3.display();
    }
}
