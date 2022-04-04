import java.util.Scanner;

public class EvenOdd {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int num = s.nextInt();
      System.out.println(evenOdd(num));
   }
   static String evenOdd(int num) {
      if (num % 2 == 0)
         return "Even";
      return "Odd";
   }
}
