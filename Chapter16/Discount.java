import java.lang.Math;
import java.util.Scanner;
public class Discount
{
  public static void main ( String[] args )
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Please input the price of your purchases in cents: ");
    int price = input.nextInt();

    if (price > 1000)
    {
      int discount = price / 10;
      int discountedPrice = price - discount;
      System.out.println("The discounted price is " + discountedPrice + " cents.");
    }
    else
    {
      System.out.println("There is no discount, the price is " + price + " cents.");
    }
  }
}
