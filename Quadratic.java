//4. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//        Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
//        can be found using a formula (Note: Take a, b and c as input values)
//        delta = b*b - 4*a*c
//        Root 1 of x = (-b + sqrt(delta))/(2*a)
//        Root 2 of x = (-b - sqrt(delta))/(2*a)
import java.util.*;
public class Quadratic
{
    public static void main(String[] args)
    {
        Scanner rs=new Scanner(System.in);
        System.out.println("Enter 3 Values: ");
        double a=rs.nextInt();double b= rs.nextInt();double c=rs.nextInt();
        double delta=b*b-4*a*c;
//        double root1=(-b + Math.sqrt(delta))/(2*a);
//        double root2=(-b + Math.sqrt(delta))/(2*a);
        double realPart = -b / (2 * a);
        double imaginaryPart = Math.sqrt(-delta) / (2 * a);
        System.out.println(realPart+" "+imaginaryPart);
    }
}
