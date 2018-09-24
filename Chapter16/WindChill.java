import java.lang.Math;
import java.util.Scanner;
public class WindChill
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Please input Wind Speed: ");
    double windSpeed = input.nextDouble();

    System.out.println("Plesase input Temperature: ");
    double temperature = input.nextDouble();

    double windChill = 35.74 + (0.6215 * temperature) - 35.75 * Math.pow( windSpeed, 0.16 ) + 0.4275 * temperature * Math.pow( windSpeed, 0.16 );

    if (windSpeed < 3 || temperature > 50)
    {
      System.out.println("There is no Wind Chill factor.");
    }
    if (windSpeed > 3 && temperature < 50)
    {
      System.out.println("Wind Chill: " + windChill);
    }
  }
}
