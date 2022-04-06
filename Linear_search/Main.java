package Linear_search;

public class Main {
   public static void main(String[] args) {
      int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
      int target = 19;
      boolean ans = lineaSearch(nums, target);
      System.out.println(ans);
   }
   //search the target and return true or false

   static boolean lineaSearch(int[] arr, int target) {
      if (arr.length == 0) {
         return false;
      }

      //run a for loop

      for (int ele : arr) {
         if (ele == target) {
            return true;
         }
      }
      //this line will execute if none of the return statements above has executed
      //hence the target not found

      return false;

   }
   //search the target and return the element 
   static int lineaSearch2(int[] arr, int target) {
      if (arr.length == 0) {
         return -1;
      }
      //run a for loop

      for (int ele : arr) {
         if (ele == target) {
            return ele;
         }
      }
      //this line will execute if none of the return satrements above have executed 
      //hence the target not found
      return Integer.MAX_VALUE;
   }
   
   //search in the array:return the index if item found

   //otherwise if item not found return -1

   static int lineaSearch3(int[] arr, int target) {
      if (arr.length == 0) {
         return -1;
      }
      
      //run a for loop

      for (int index = 0; index < arr.length; index++) {
         int ele = arr[index];
         if (ele == target) {
            return index;
         }
      }
      //this line will execute if none of the return statements above have executed
      //hence the target not found

      return -1;
   }
}
