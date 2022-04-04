package Recrusion;

public class Decimal_to_binary {
   public static void main(String[] args) {
      Decimal_to_binary main = new Decimal_to_binary();
      var result = main.decimalToBinary(5);
      System.out.println(result);
   }

   public int decimalToBinary(int n) {
      if (n == 0) {
         return 0;
      }
      return n % 2 + 10 * decimalToBinary(n / 2);
   }
}
 