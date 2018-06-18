package fibonacci;
// generate list of fibonacci numbers

public class Fibonacci {
  public static int fib(int num) {
    if(num <= 1) {
      return 0;
    } else if (num == 2) {
      return 1;
    } else {
      return fib(num - 1) + fib(num - 2);
    }
  }

  public static void main(String[] args ) {
    System.out.println(fib(34));
  }
}
