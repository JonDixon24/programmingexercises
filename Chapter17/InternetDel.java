import java.lang.Math;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
public class InternetDel
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);

      System.out.println("Enter the item: ");
      String item = input.nextLine();

      System.out.println("Enter the price: ");
      Double price = input.nextDouble();

      System.out.println("Overnight delivery? (0==no, 1==yes): ");
      int delivery = input.nextInt();

      Double deliveryPrice = 0.00;

      if (delivery == 1)
      {
        deliveryPrice += 3.00;
        if (price < 10.00)
        {
          deliveryPrice += 2.00;
        }
      }

      Double totalPrice = price + deliveryPrice;

      System.out.println("" + item + "    " + " " + price);
      System.out.println("delivery " + "    " + " " + deliveryPrice);
      System.out.println("total " + "    " + " " + totalPrice);
    }
  }
