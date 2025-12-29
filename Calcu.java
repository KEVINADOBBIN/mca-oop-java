class Calc
{
    static double ans;

    static double add(double a, double b)
    {
        ans = a + b;
        return ans;
    }

    static double sub(double a, double b)
    {
        ans = a - b;
        return ans;
    }

    static double mult(double a, double b)
    {
        ans = a * b;
        return ans;
    }

    static double div(double a, double b)
    {
        ans = a / b;
        return ans;
    }
}

class Calcu
{
    public static void main(String args[])
    {
        System.out.println("KEVIN A DOBBIN MCA 'A' SEC\n");

        System.out.println("Addition      : " + Calc.add(90.1, 67.9));
        System.out.println("Subtraction   : " + Calc.sub(12.76, 45.9));
        System.out.println("Product       : " + Calc.mult(34.6, 90.09));
        System.out.println("Division      : " + Calc.div(342.7, 9.9));
    }
}
