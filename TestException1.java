import java.util.Scanner;

// User-defined exception
class NegException extends Exception {
    int n;

    // Constructor
    NegException(int no) {
        n = no;
    }

    // Override toString method
    public String toString() {
        return "Negative Exception: " + n;
    }
}

// Main class
public class TestException1 {
    public static void main(String[] args) {

        int a;
        Scanner S = new Scanner(System.in);

        System.out.println("KEVIN A DOBBIN MCA 'A' SEC\n");

        try {
            System.out.print("Enter a number: ");
            a = S.nextInt();

            // Throw user-defined exception if negative
            if (a < 0)
                throw new NegException(a);

            System.out.println("You entered a positive number: " + a);

        } catch (NegException e) {
            System.out.println("Caught the exception: " + e);
        }

        S.close();
    }
}
