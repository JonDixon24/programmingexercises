public class Rainfall
{
  public static void main ( String[] args )
  {
    double april = 12.0;
    double may = 14.0;
    double june = 8.0;
    double months = april + may + june;
    double average = months / 3.0;
    System.out.println("Rainfall for April: " + april);
    System.out.println("Rainfall for May: " + may);
    System.out.println("Rainfall for June: " + june);
    System.out.println("Average Rainfall: " + average);
  }
}
