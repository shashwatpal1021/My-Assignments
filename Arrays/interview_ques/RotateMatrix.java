package Arrays.interview_ques;

import java.util.Arrays;

public class RotateMatrix {
   public static void main(String[] args) {
      RotateMatrix mn = new RotateMatrix();
      int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
      mn.rotateMatrix(matrix);
      System.out.println(Arrays.deepToString(matrix));
   }

   public boolean rotateMatrix(int[][] matrix) {
      if(matrix.length==0 || matrix.length != matrix[0].length)
         return false;
      int n = matrix.length;
      for (int i = 0; i < n / 2; i++) {
         int first = i;
         int last = n - 1 - i;
         for (int j = first; j < last; j++) {
            int offset = j - first;
            int top = matrix[first][j];
            matrix[first][j] = matrix[last - offset][first];
            matrix[last - offset][first] = matrix[last][last - offset];
            matrix[last][last - offset] = matrix[j][last];
            matrix[j][last] = top;
         }
      } 
      return true;
   }
}
