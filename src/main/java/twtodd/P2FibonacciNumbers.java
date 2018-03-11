package twtodd;

public class P2FibonacciNumbers {

  public static void main(String[] args) {
    int sum = 0;
    int z;
    int c;
    for (int i = 1, y = 2; y < 4000000; i = z, y += c) {
      if (y % 2 == 0) {
        sum += y;
      }
      c = i;
      z = y;
    }
    System.out.println("Sum of even Fibonacci numbers until 4000000: " + sum);
  }
}

