import java.util.Scanner;
public class circleArea
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Input the radius: ");
    int i = input.nextInt();

    int radiusSquared = i * i;
    double area = Math.PI * radiusSquared;

    System.out.println("The area is: " + area);
  }
}
