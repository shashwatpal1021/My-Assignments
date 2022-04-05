package Basics;

import java.util.Scanner;

public class TypeCasting {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      // float num = s.nextInt();
      // int num = s.nextInt();
      // System.out.println(num);

      // int num = (int) (67.56f);
      // System.out.println(num);

      // int a = 257;
      // byte b = (byte) (a);

      // byte a = 40;
      // byte b = 50;
      // byte c = 100;
      // int d = a * b / c;

      // System.out.println(d);

      // byte b = 50;
      // b = b * 2;

      // int number = 'A';
      // System.out.println(number);

      // System.out.println(3 * 4);
      
      byte b = 42;
      char c = 'a';
      short so = 1024;
      float f= 5.67f;
      int i=499498;
      double d = 0.1234;
      double result = (f * b) + (i / c) - (d * so);
      System.out.println((f * b) + " " + (i / c) + " " + (d * so));
      System.out.println(result);
   }
}
