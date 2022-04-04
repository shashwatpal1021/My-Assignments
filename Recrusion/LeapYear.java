//Input a year and find whether it is a leap year or not.
import java.util.*;
class LeapYear {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int year;
      while ((year=s.nextInt()) != 0) {
         System.out.println(leapYear(year));
      }
   }
   static boolean leapYear(int year){  
      if(year%400==0 && year%100==0 || year%4==0){
         return true;
      }
      return false;
   }
}