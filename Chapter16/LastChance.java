import java.lang.Math;
import java.util.Scanner;
public class LastChance
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Please input the maximum capacity of your fuel tank: ");
    Double capacity = input.nextDouble();

    System.out.println("Please input the current gas gauge level (in %): ");
    Double level = input.nextDouble();

    System.out.println("Please input the miles per gallon rating of your car: ");
    Double milesPerGallon = input.nextDouble();

    Double levelDecimal = level / 100;
    Double currentGas = capacity * levelDecimal;
    Double possibleMileage = currentGas * milesPerGallon;

    System.out.println("Tank capacity: ");
    System.out.println(" " + Math.round(capacity)); // by using Math.round(), i convert the double into an int
    System.out.println("Gauge reading: ");
    System.out.println(" " + Math.round(level));
    System.out.println("Miles per gallon: ");
    System.out.println(" " + Math.round(milesPerGallon));

    if (possibleMileage > 200)
    {
      System.out.println("Safe to Proceed.");
    }

    if (possibleMileage < 200)
    {
      System.out.println("Get Gas!");
    }

  }
}
