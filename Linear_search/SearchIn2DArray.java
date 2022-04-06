package Linear_search;

import java.util.Arrays;

public class SearchIn2DArray {
   public static void main(String[] args) {
      int[][] arr = {
            { 23, 4, 1 },
            { 18, 12, 3, 9 },
            { 78, 99, 34, 56 },
            { 18, 12 }
      };
      int target = 56;
      int[] ans = search(arr, target);//format of return value{row,col}

      System.out.println(Arrays.toString(ans));
      System.out.println(max(arr));
      System.out.println(Integer.MIN_VALUE);
   }

   static int[] search(int[][] arr, int target) {
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == target) {
               return new int[] { i, j };
            }
         }
      }
      return new int[] { -1, -1 };
   }
   
   static int max(int[][] arr) {
      int max = Integer.MIN_VALUE;
      for (int[] i : arr) {
         for (int ele : i) {
            if (ele > max) {
               max = ele;
            }
         }
      }
      return max;
   }
}
