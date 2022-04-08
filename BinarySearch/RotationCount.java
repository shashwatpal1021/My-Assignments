package BinarySearch;

public class RotationCount {
   public static void main(String[] args) {
      int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
      System.out.println(countRotation(arr));
   }

   public static int countRotation(int[] arr) {
      int pivot = findPivot(arr);
      return pivot + 1;
   }

   //use this for non duplicates

   static int findPivot(int[] arr) {
      int l = 0, r = arr.length - 1;
      while (l <= r) {
         int m = l + (r - l) / 2;
         //4 cases over here
         if (m < r && arr[m] > arr[m + 1]) {
            return m;
         }
         if (m > l && arr[m] < arr[m - 1]) {
            return m - 1;
         }
         if (arr[m] <= arr[l]) {
            r = m - 1;
         } else {
            l = m + 1;
         }
      }
      return -1;
   }

   //use this when arr contains duplicates 

   static int findPivotWithDuplicates(int[] arr) {
      int l = 0, r = arr.length - 1;
      while (l <= r) {
         int m = l + (r - l) / 2;
         // 4 cases over here

         if (m < r && arr[m] > arr[m + 1]) {
            return m;
         }
         if (m < r && arr[m] < arr[m + 1]) {
            return m - 1;
         }
         //if element at middle,l,r are equal then just skip the duplicates
         if (arr[m] == arr[l] && arr[m] == arr[r]) {
            // skip the duplicates
            // NOTE: what if these elements at l and r were the pivot??
            // check if l is pivot
            if (arr[l] > arr[l + 1]) {
               return l;
            }
            l++;

            // check whether r is pivot
            if (arr[r] < arr[r - 1]) {
               return r - 1;
            }
            r--;
         }
         // left side is sorted, so pivot should be in right
         else if (arr[l] < arr[m] || (arr[l] == arr[m] && arr[m] > arr[r])) {
            l = m + 1;
         } else {
            r = m - 1;
         }
      }
      return -1;
   }
}
