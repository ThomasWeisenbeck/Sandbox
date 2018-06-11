package ProjectEuler;
import java.util.ArrayList;

public class euler10 {
  static final int TWOMILLION = 2000000;
  static final double maxRoot = Math.sqrt(TWOMILLION);
  static ArrayList<Integer> primes = new ArrayList<Integer>();
  static long sum = 0;
  static ArrayList<Boolean> booleans = new ArrayList<Boolean>();

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();

    for(int i = 0; i < TWOMILLION; i++) {
      if (i == 1 || i % 2 == 0 && i != 2) {
        booleans.add(false);
      } else {
        booleans.add(true);
      }
    }

    for(int i=3; i <= maxRoot; i+=2) {
      for(int j=3; j <= TWOMILLION; j+=2) {
        if(i*j < TWOMILLION) {
          booleans.set(i*j, false);
        } else {
          break;
        }
      }
    }

    for(int i = 0; i < TWOMILLION; i++) {
      if (booleans.get(i)) {
        primes.add(i);
        sum += i;
        if(sum<0) {
          System.out.println(sum);
        }
      }
    }
    System.out.println(sum);
    System.out.println(primes.get(10000));
    System.out.println(System.currentTimeMillis() - startTime);
    // Runtime: 75-85 milliseconds across multiple tests.
  }
}
