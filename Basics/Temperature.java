package Basics;

import java.util.Scanner;

public class Temperature {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("plz enter tem in c: ");
      float tempC = s.nextInt();
      float tempF = (tempC * 9 / 5) + 32;
      System.out.println(tempF);
   }
}
