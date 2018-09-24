import java.util.Scanner;
public class centConversion
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Input the cents: ");
    int cents = input.nextInt();

    int conversion = cents / 100;
    int remainder = cents % 100;

    System.out.println("That is " + conversion + " dollars, and " + remainder + " cents." );

  }
}
