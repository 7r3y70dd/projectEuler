package twtodd;

public class P1Multiples3And5 {

  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    System.out.println("sum of modulus 3 or 5 under 1000: " + sum);
  }
}
