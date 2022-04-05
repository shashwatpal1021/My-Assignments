package Basics;

import java.util.Scanner;

public class Sum {
   public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      float num1 = s.nextInt();
      float num2 = s.nextInt();

      float sum = num1 + num2;

      System.out.println("sum= "+sum);
   }
}
