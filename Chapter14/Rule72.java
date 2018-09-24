import java.util.Scanner;
import java.lang.Math;
public class Rule72
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Please input the initial deposit: ");
    double initial = input.nextDouble();

    System.out.println("Please input the annual interest rate as a decimal: ");
    double interest = input.nextDouble();

    double approxYears = initial * interest;

    System.out.println("The approximate number of years is: " + approxYears);
  }
}
