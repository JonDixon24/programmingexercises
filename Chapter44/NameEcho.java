import java.util.Scanner;
import java.lang.Math;
public class NameEcho {

  public static void main ( String[] args ) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your first and last name.");
    String name = input.nextLine();

    name = name + "-";

    int firstSpace = name.indexOf(" ");
    int lastChar = name.indexOf("-");

    String firstLetter = name.substring(0,1);
    String lastName = name.substring(firstSpace+1, lastChar);
    String firstName = name.substring(0, firstSpace);

    lastName = lastName.toUpperCase();

    System.out.println("" + firstName + " " + "" + lastName);
  }
}
