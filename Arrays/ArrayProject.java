package Arrays;

import java.util.Scanner;

public class ArrayProject {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("How many day's temperatures? ");
      int numDays = s.nextInt();
      int[] temps = new int[numDays];

      //record temperatures and find average

      int sum = 0;
      for (int i = 0; i < numDays; i++) {
         System.out.print("Day " + (i + 1) + "'s high temp: ");
         temps[i] = s.nextInt();
         sum += temps[i];
      }

      double average = sum / numDays;
      
      //count days above average

      int above = 0;
      for (int i = 0; i < temps.length; i++) {
         if (temps[i] > average) {
            above++;
         }
      }
      System.out.println();
      System.out.println("Average Temp = " + average);
      System.out.println(above +" days above average");
   }
}
