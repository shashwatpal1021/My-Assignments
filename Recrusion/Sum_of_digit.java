package Recrusion;

public class Sum_of_digit {
   public static void main(String[] args) {
      Sum_of_digit main = new Sum_of_digit();
      var result = main.sumOfDigits(111);
      System.out.println(result);
  }

   // Question 1

   public int sumOfDigits(int n) {

      if (n == 0 || n < 0) {
         return 0;
      }
      return n % 10 + sumOfDigits(n / 10);
   }

}
