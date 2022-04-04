package Arrays.interview_ques;

public class FindANumber {
   public static void main(String[] args) {
      FindANumber mNumber= new FindANumber();
      int[] intArray={1,2,3,4,5,6};
      mNumber.linearSearch(intArray,7);
   }

   //Linear Search

   public void linearSearch(int[] intArray,int value){
      for (int i = 0; i < intArray.length; i++) {
         if(intArray[i]==value){
            System.out.println("value is found at the index of "+i);
            return;
         }
      }
      System.out.println(value+" is not found");
   }
}
