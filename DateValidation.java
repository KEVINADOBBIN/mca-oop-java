import java.util.Scanner;

class DateValidation
{
    public static void main(String args[])
    {
        String dt;
        short dd, mm, yr, days = 0;

        System.out.println("KEVIN A DOBBIN\n");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the date in dd/mm/yyyy format:");
        dt = s.next();

        String[] dt_str = dt.split("/", 3);

        dd = Short.parseShort(dt_str[0]);
        mm = Short.parseShort(dt_str[1]);
        yr = Short.parseShort(dt_str[2]);

        switch (mm)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 2:
                days = checkLeap(yr);
                break;

            default:
                System.out.println("Invalid Date");
                return;
        }

        if (dd > 0 && dd <= days)
            System.out.println("Valid Date");
        else
            System.out.println("Invalid Date");
    }

    static short checkLeap(short yr)
    {
        if ((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0))
            return 29;
        else
            return 28;
    }
}
