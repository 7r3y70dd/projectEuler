package twtodd;

public class P3LargestPrimeFactor {

  public static void main(String[] args) {
    int n = 133195, m = n, largest = 0;
    while(m%2==0) {
      System.out.println("2 ");
      m /= 2;
      largest = 2;
    }
    System.out.println("Largest prime factor of " + n + ": " + largest);
  }
}
