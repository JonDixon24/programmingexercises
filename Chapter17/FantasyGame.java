import java.lang.Math;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
public class FantasyGame
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Wardchet Quest");

    System.out.println("Enter the name of your character: ");
    String charName = input.nextLine();

    System.out.println("Enter your strength stat (1-10): ");
    int strength = input.nextInt();

    System.out.println("Enter your health stat (1-10): ");
    int health = input.nextInt();

    System.out.println("Enter your luck stat (1-10): ");
    int luck = input.nextInt();

    int total = strength + health + luck;

    if (total > 15)
    {
      System.out.println("You have given your character too many stat points, ");
      System.out.println("Default stats values have been assigned.");
      System.out.println("" + charName + ", strength: 5, health: 5, luck: 5");
    }

    else
    {
      System.out.println("" + charName + ", strength: " + strength + ", health: " + health + ", luck: " + luck);
    }
  }
}
