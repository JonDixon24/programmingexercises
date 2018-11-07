import java.util.Scanner;
import java.lang.Math;
public class PasswordCheck {
  public static void main ( String[] args ) {

    Scanner input = new Scanner(System.in);
    boolean hasUpperCase = false;


    System.out.println("Please enter your password.");
    String userPass = input.nextLine();

    userPass = userPass + "-";
    String lowerCasePass = userPass.toLowerCase();

    if (userPass.equals(lowerCasePass)) {
      hasUpperCase = false;
    }
    else {
      hasUpperCase = true;
    }

    int passLength = userPass.length();

    if (hasUpperCase = true && passLength >= 8) {
      System.out.println("This password is acceptable.");
    }

    else {
      System.out.println("This password does not match the requirements.");
    }

  }
}
