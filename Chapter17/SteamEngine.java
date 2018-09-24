import java.lang.Math;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
public class SteamEngine
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Please input the air temperature: ");
    double tair = input.nextInt();

    System.out.println("Please input the steam temperature: ");
    double tsteam = input.nextInt();

    double efficiency = 1 - ( tair / tsteam );

    if (tsteam < 373)
    {
      efficiency = 0;
    }

    System.out.println("The steam engine's efficiency is: " + efficiency + "%");

  }
}
