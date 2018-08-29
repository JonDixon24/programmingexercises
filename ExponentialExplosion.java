public class ExponentialExplosion
{
  public static void main ( String[] args )
  {
    double value = 709.7819999; // this program can handle an infinite number of 9's after
                                // the .781, but cannot compute at .782 or above.
    System.out.println("e to the power value: " + Math.exp( value ) );
  }
}
