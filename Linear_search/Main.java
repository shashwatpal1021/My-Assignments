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
}
