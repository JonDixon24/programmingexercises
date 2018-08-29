import java.util.Scanner;
public class consolePractice
{
  public static void main ( String[] args );
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your name : ");
    String s = input.next();

    System.out.println("Please enter your age : ");
    int i = input.nextInt();

    System.out.println("Please enter your salary : ");
    double d = input.nextDouble();
  }
}
