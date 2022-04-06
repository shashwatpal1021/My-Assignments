package Linear_search;

public class EvenDigits {
   public static void main(String[] args) {
      int[] nums = { 12, 345, 2, 6, 7896 };
      System.out.println(findNum(nums));

      // System.out.println(digits2(-345678));
   }

   static int findNum(int[] nums) {
      int result = 0;
      for (int i = 0; i < nums.length; i++) {
         if (numsOfDigits(nums[i]) % 2 == 0)
            result++;
      }
      return result;
   }

   static int numsOfDigits(int n) {
      int count = 0;
      while (n > 0) {
         n /= 10;
         count++;
      }
      return count;
   }
}
