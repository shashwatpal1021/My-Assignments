import java.util.Scanner;

public class LCMHCF {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int num1 = s.nextInt();
      int num2 = s.nextInt();
      System.out.println(LCM(num1, num2));
      System.out.println(HCF(num1, num2));
   }

   static int LCM(int a, int b) {
      return((a / HCF(a, b)) * b);
   }

   static int HCF(int a, int b) {
      if(a==0)
         return b;
      return HCF(b % a, a);
   }
}


// Take 2 numbers as inputs and find their HCF and LCM.