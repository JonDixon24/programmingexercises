import java.lang.Math;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
public class CheckCharge
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Please input the balance in your checking account: ");
    int balanceChecking = input.nextInt();

    System.out.println("Please input the balance in your savings account: ");
    int balanceSaving = input.nextInt();

    if (balanceChecking > 1000 || balanceSaving > 1500)
    {
      System.out.println("You owe no service charge.");
    }

    else
    {
      System.out.println("You owe a $0.15 service charge per check.");
    }
  }
}
