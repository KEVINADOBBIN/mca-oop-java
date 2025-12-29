import java.util.Scanner;

class Multi
{
    public static void main(String[] args)
    {
        int m, n, ans;

        System.out.println("KEVIN A DOBBIN MCA 'A' SEC\n");

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the m and n values: ");
        m = s.nextInt();
        n = s.nextInt();

        for (int no = m; no <= n; no++)
        {
            System.out.println("\nMultiplication Table of " + no);
            for (int j = 1; j <= 10; j++)
            {
                ans = no * j;
                System.out.println(no + " * " + j + " = " + ans);
            }
        }
    }
}
