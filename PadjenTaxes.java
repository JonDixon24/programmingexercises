import java.lang.Math;
import java.util.Scanner;
public class PadjenTaxes
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);
//Take user input for calculations
    System.out.println("Please input your current yearly salary: ")
    int salary = input.nextInt();

    System.out.println("Please input the number of children currently under your care");
    System.out.println("If none, please input the number '0': ")
    int children = input.nextInt();

    System.out.println("Please input your age: ")
    int age = input.nextInt();

//Series of if statements to determine tax rate
    if (salary <= 10000)
    {
      double taxRate = 0;
    }

    if (salary > 10000 || salary <= 25000)
    {
      double taxRate = 0.10;
    }

    if (salary > 25000 || salary <= 75000)
    {
      double taxRate = 0.20;
    }

    if (salary > 75000 || salary <= 250000)
    {
      double taxRate = 0.30;
    }

    if (salary > 250000)
    {
      double taxRate = 0.50;
    }

    double marginalTaxes = salary * taxRate;

    if (age > 0 || age < 15)
    {
      double ageDiscount = 0.50;
    }

    if ()

  }
}
