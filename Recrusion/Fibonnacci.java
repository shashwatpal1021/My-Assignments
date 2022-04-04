package Recrusion;

public class Fibonnacci {
   public static void main(String[] args) {
      Fibonnacci rec = new Fibonnacci();
      var recursion = rec.fibonacci(10);
      System.out.println(recursion);
   }

   public int fibonacci(int n) {
      if (n < 0) {
         return -1;
      }
      if (n == 0 || n == 1) {
         return n;
      }
      return fibonacci(n - 1) + fibonacci(n - 2);
   }
} 
