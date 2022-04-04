import java.util.Scanner;

public class SumOfTwoNum {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int num1 = s.nextInt();
      int num2 = s.nextInt();
      System.out.println(sum(num1,num2));
   }

   static int sum(int a, int b) {
      return a + b;
   }
}


//Take two numbers and print the sum of both.