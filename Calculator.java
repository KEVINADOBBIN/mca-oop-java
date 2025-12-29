Calculator.java

package calc;

public class Calculator
{ 
public double add(double a, double b)
{ 
return (a + b);
} 
public double sub(double a, double b)
{ 
return (a - b);
} 
public double mult(double a, double b)
{ 
return (a * b);
} 
public double div(double a, double b)
{ 
return (a/b);
}
}

Arith.java
package arith;
import calc.*;
class Arith
{
public static void main(String args[])
{ 
System.out.println("KEVIN A DOBBIN MCA 'A' SEC\n");
double a = 5.65;
double b = 10.5;
Calculator c1 = new Calculator();
System.out.println(c1.add(a, b));
System.out.println(c1.sub(a, b));
System.out.println(c1.mult(a, b));
System.out.println(c1.div(a, b));
} 
}

