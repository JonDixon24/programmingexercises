import java.util.Scanner; // imports Scanner utility
public class Dndstats // java steup
{
  public static void main ( String[] args ) // java setup
  {
    Scanner input = new Scanner(System.in); // defines input as scanner variable

    System.out.println("Input your desired stat rating: "); // print output
    int stat = input.nextInt(); // allow for user input

    int statBonus = (stat - 10) / 2;

    if (stat <= 10)
    {
      System.out.println("There is no stat bonus.");
    }
    else
    {
      System.out.println("Your stat bonus is: " + statBonus );
    }
  }
}
