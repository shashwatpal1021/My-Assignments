package Basics;

import java.util.Scanner;

public class Prime {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("plz enter a num");
      int n = s.nextInt();
      if (n <= 1) {
         System.out.println("neither prime nor composite");
         return;
      }
      int c = 2;
      while (c * c <= n) {
         if (n % c == 0) {
            System.out.println("Not prime");
            return;
         }
         c++;
      }
      if (c * c > n) {
         System.out.println("prime");
      }
   }
}
