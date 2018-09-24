import java.util.Scanner;
import java.lang.Math;
public class ValueCalculation
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Please input intial deposit amount: ");
    double initial = input.nextDouble();

    System.out.println("Please input the interest rate (as a decimal): ");
    double interest = input.nextDouble();

    System.out.println("Please input the number of times per year interest is calculated: ");
    double frequency = input.nextDouble();

    System.out.println("Please input the number of years since initial deposit: ");
    double years = input.nextDouble();

    double exponent = frequency * years;
    double parentheses = 1 + interest/frequency;
    double value = initial * Math.pow ( parentheses, exponent);

    System.out.println("Initial deposit: " + initial);
    System.out.println("Interest rate: " + interest);
    System.out.println("Times per year: " + frequency);
    System.out.println("Number of years: " + years);
    System.out.println("Value: " + value);
  }
}
