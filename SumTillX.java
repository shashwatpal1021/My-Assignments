import java.util.Scanner;

public class SumTillX {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String str = s.next();
      while (true) {
         System.out.println("enterm num1: ");
         int num1 = s.nextInt();
         System.out.println("enterm num2: ");
         int num2 = s.nextInt();
         System.out.println("Sum of numbers: " + num1 + num2);
      }
   }
}



/*
pending question?


Keep taking numbers as inputs till the user enters‘x’, after that print sum of all.
.*/