import java.lang.Math;
import java.util.Scanner;
public class PieEatingContest
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the heavyweight division of the Pie Eating Contest.");
    System.out.println("A contestant must be within 30 lbs of 250 lbs to participate.");
    System.out.println("Please input your current weight: ");
    Double contestantWeight = input.nextDouble();

    Double weightDifference = 250 - contestantWeight;

    if (weightDifference <= 30)
    {
      System.out.println("You are within the required range, good luck!");
    }

    if (weightDifference > 30)
    {
      System.out.println("You are not within the required range, sorry!");
    }

  }
}
