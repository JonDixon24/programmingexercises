import java.lang.Math;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
public class TownDump
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Please input the weight of your trash (lbs): ");
    int trashWeight = input.nextInt();
    int disposalCost = 0;

    if (trashWeight > 200)
    {
      disposalCost += 20;
      trashWeight =- 200;

      if (trashWeight >= 100)
      {
        disposalCost += 8;
        trashWeight =- 100;
      }

      else
      {
        System.out.println("You will be charged $" + disposalCost);
      }
    }
  }
}
