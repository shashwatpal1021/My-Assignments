import java.util.Scanner;

public class Table {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int num = s.nextInt();
      table(num);
   }

   static void table(int a) {
      int sum = 0;
      for (int i = 1; i < 11; i++) {
         sum+=a;
         System.out.println(sum);
      }
   }
}


// Take a number as input and print the multiplication table for it.