package Arrays.interview_ques;

public class Isunique {
   public static void main(String[] args) {
      Isunique mn = new Isunique();
      int[] arr = { 1, 2, 3, 6, 5, 6 };
      boolean result = mn.isUnique(arr);
      System.out.println(result);
   }
   // Is unique

   public boolean isUnique(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
               return false;
            }
         }
      }
      return true;
   }
}
