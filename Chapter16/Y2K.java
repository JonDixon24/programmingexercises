import java.lang.Math;
import java.util.Scanner;
public class Y2K
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Please input your year of birth: ");
    int yearOfBirth = input.nextInt();

    System.out.println("Please input the current year: ");
    int currentYear = input.nextInt();

    int yourAge = yearOfBirth - currentYear;

    System.out.println("Your age: " + yourAge);
  }
}
