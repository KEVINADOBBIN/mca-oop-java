import java.util.Scanner;
class Fibonacci
{
    public static void main(String[] args)
    {
        int t1 = 0, t2 = 1, sum;
        
        System.out.println("KEVIN A DOBBIN MCA 'A' SEC\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("First " + n + " terms of Fibonacci series:");

        for (int i = 1; i <= n; i++)
        {
            System.out.print(t1 + " ");
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
