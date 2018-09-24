import java.util.Scanner;
public class chooseYourOwnAdventure
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);

    System.out.println("You are standing in a forest with three paths branching the the North, East, and West.");
    System.out.println("Which path do you take?");
    String path = input.next();

    if (path.equals("North"))
    {
      System.out.println("TestNorth.");
      boolean direction = true;
    }
    else
    {
      if (path.equals("West"))
      {
        System.out.println("TestWest.");
        boolean direction = true;
      }
      else
      {
        if (path.equals("East"))
        {
          System.out.println("TestEast.");
          boolean direction = true;
        }
        if (direction.equals(true))
        {
          System.out.println("Please choose a direction.");
          boolean direction = false;
        }
      }
    }
  }
}
