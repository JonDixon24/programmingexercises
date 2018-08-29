import java.util.Scanner;
import java.lang.Math;
public class NewTest

{

	public static void main( String[] args )

	{

		Scanner input = new Scanner(System.in);

		System.out.println("Input initial deposit amount: ");
		double initial = input.nextDouble();

		System.out.println("Input interest rate in decimal form: ");
		double interest = input.nextDouble();

		System.out.println("Input number of annual interest applications: ");
		double frequency = input.nextDouble();

		System.out.println("Input number of years since intial deposit: ");
		double years = input.nextDouble();

		double exponent = frequency * years;
		double parentheses = 1 + interest/frequency;
		double value = initial * Math.pow ( parentheses, exponent );

		System.out.println("The total value of your deposit is now: " + value);

	}

}
