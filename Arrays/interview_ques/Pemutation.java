package Arrays.interview_ques;

import java.time.Period;

public class Pemutation {
   public static void main(String[] args) {
      Pemutation mn = new Pemutation();
      int[] arr1 = { 1, 2, 3, 4, 5 };
      int[] arr2 = { 5, 4, 3, 2, 1, 0 };
      boolean result = mn.permutation(arr1, arr2);
      System.out.println(result);
   }

   //Permutation

   public boolean permutation(int[] arr1, int[] arr2) {
      if (arr1.length != arr2.length) {
         return false;
      }
      int sum1 = 0;
      int sum2 = 0;
      int mult1 = 1;
      int mult2 = 1;

      for (int i = 0; i < arr1.length; i++) {
         sum1 += arr1[i];
         sum2 += arr2[i];
         mult1 = arr1[i];
         mult2 *= arr2[i];
      }
      if (sum1 == sum2 && mult1 == mult2) {
         return true;
      }
      return false;
   }
}
