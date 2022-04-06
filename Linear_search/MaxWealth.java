package Linear_search;

public class MaxWealth {
   public static void main(String[] args) {

   }

   public int maximumWealth(int[][] accounts) {
      //person=row;
      //account=col;
      int ans = Integer.MIN_VALUE;

      for (int[] ints : accounts) {
         //when you start a new row, take a new sum for that row int sum=0;

         for (int anInts : ints) {
            sum += anInts;
         }

         //now we have sum of accounts of person
         //check with overall ans
         if (sum > ans) {
            ans = sum;
         }
      }
      return ans;
   }
   /*
   public int maximumWealth(int[][] accounts) {
                int ans = -1;
                for(int i = 0; i < accounts.length; i++) {
                    int sum = 0;
                    for(int j = 0; j < accounts[i].length; j++) {
                        sum += accounts[i][j];
                    }
                    if(sum > ans) {
                        ans = sum;
                    }
                }
                return ans;
            }
   */
}
