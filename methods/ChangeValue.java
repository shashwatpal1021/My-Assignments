package methods;

import java.util.Arrays;

public class ChangeValue {
   public static void main(String[] args) {
      int[] a = { 1, 2, 3, 4, 6, 7 };
      change(a);
      System.out.println(Arrays.toString(a));
   }

   static void change(int[] nums) {
      nums[0] = 99;// if you make a change to the object via this ref variable, same object will be changed
    }
}
