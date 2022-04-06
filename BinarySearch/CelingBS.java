package BinarySearch;

public class CelingBS {
   public static void main(String[] args) {
      //int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
      int[] arr = { -9, -6, -4, -2, 4, 6 };
      int target = -7;
      int ans = ceiling(arr, target);
      System.out.println(ans);
   }

   // return the index of smallest no >= target
   static int ceiling(int[] arr, int target) {

      // but what if the target is greater than the greatest number in the array
      if (target > arr[arr.length - 1]) {//checking greatest value present in the array at the last bcoz of sorted array
         return -1;
      }
      int start = 0;
      int end = arr.length - 1;

      while (start <= end) {
         // find the middle element
         // int mid = (start + end) / 2; // might be possible that (start + end) exceeds
         // the range of int in java
         int mid = start + (end - start) / 2;

         if (target < arr[mid]) {
            end = mid - 1;
         } else if (target > arr[mid]) {
            start = mid + 1;
         } else {
            // ans found
            return mid;
         }
      }
      return start;
   }
}
