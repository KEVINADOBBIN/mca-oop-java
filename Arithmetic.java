class Arithmetic
{
    public static void main(String[] args)
    {
        int a = 5, b = 3;
        float c;

        System.out.println("KEVIN A DOBBIN MCA 'A' Sec\n");

        // Demonstrating operator precedence
        c = 10 + 13 % 9 / 4 - 2;
        System.out.println("10 + 13 % 9 / 4 - 2 = " + c);

        // Overriding precedence using parentheses
        c = (10 + 13) % 9 / (4 - 2);
        System.out.println("(10 + 13) % 9 / (4 - 2) = " + c);

        // Demonstrating associativity and unary operators
        c = a++ * ++b / ++a + 3;
        System.out.println("a++ * ++b / ++a + 3 = " + c);

        // Reset values
        a = 5;
        b = 3;

        c = a++ * ++b / (++a + 3);
        System.out.println("a++ * ++b / (++a + 3) = " + c);
    }
}
