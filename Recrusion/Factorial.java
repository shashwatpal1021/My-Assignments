package Recrusion;

public class Factorial {
   public static void main(String[] args) {
      Factorial obj = new Factorial();
      var obj1 = obj.factorial(-2);
      System.out.println(obj1);
   }

   public int factorial(int n) {
      if (n < 1) {
         return -1;
      }
      if (n == 0 || n == 1) {
         return 1;
      }
      return n * factorial(n - 1);
   }
}
