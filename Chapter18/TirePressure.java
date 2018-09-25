import java.lang.Math;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
public class TirePressure
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Input right front tire pressure");
    int rightFront = input.nextInt();
    boolean goodInflation = true;

    if (rightFront < 35 || rightFront > 45)
    {
      System.out.println("Warning: pressure is out of range");
      goodInflation = false;
    }

    System.out.println("Input left front tire pressure");
    int leftFront = input.nextInt();

    if (leftFront < 35 || leftFront > 45)
    {
      System.out.println("Warning: pressure is out of range");
      goodInflation = false;
    }

    System.out.println("Input back right tire pressure");
    int backRight = input.nextInt();

    if (backRight < 35 || backRight > 45)
    {
      System.out.println("Warning: pressure is out of range");
      goodInflation = false;
    }

    System.out.println("Input back left tire pressure");
    int backLeft = input.nextInt();

    if (backLeft < 35 || backLeft > 45)
    {
      System.out.println("Warning: pressure is out of range");
      goodInflation = false;
    }

    if (rightFront == leftFront && backRight == backLeft && goodInflation == true)
    {
      System.out.println("Inflation is OK.");
    }

    else
    {
      System.out.println("Recalibrate tire inflation.");
    }
  }
}
