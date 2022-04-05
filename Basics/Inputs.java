package Basics;

import java.util.Scanner;

public class Inputs {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("plz enter some input: ");
      int rollno = s.nextInt();
      System.out.println("your roll num is " + rollno);
      String name = s.next();
      System.out.println(name);
      float marks = s.nextFloat();
      System.out.println(marks);
   }
}
