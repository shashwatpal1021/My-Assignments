package Arrays.interview_ques;

public class MaxProduct {
   public static void main(String[] args) {
      MaxProduct mn = new MaxProduct();
      int[] arr = { 10, 60, 30, 40, 50 };
      String pairs = mn.maxProduct(arr);
      System.out.println(pairs);
   }
   //Max product

   public String maxProduct(int[] arr) {
      int maxProduct = 0;
      String pairs = "";
      for (int i = 0; i < arr.length; i++) {
         for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] * arr[j] > maxProduct) {
               maxProduct = arr[i] * arr[j];
               pairs = Integer.toString(arr[i]) + "," + Integer.toString(arr[j]);
            }
         }
      }
      return pairs;
   }
}
