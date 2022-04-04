package Arrays;

public class TwoDimensionArray {
   int arr[][] = null;

   public TwoDimensionArray(int row, int col) {
      this.arr = new int[row][col];
      for (int r = 0; r < arr.length; r++) {
         for (int c = 0; c < arr.length; c++) {
            arr[r][c] = Integer.MIN_VALUE;
         }
      }
   }

   //Inserting value in the Array


   public void insertValueInTheArray(int r, int c, int value) {
      try {
         if (arr[r][c] == Integer.MIN_VALUE) {
            arr[r][c] = value;
            System.out.println("The value is successfully inserted");
         } else {
            System.out.println("This cell is already occupied");
         }
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Invalid index for 2D array");
      }
   }
   
   //Acessing cell value from given array

   public void accessCell(int r, int c) {
      System.out.println("\nAccessing Row#" + r + ", col#" + c);
      try {
         System.out.println("cell value is: " + arr[r][c]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Invalid index for 2D array");
      }
   }
   
   // Traverse 2D array

   public void trverse2DArray() {
      for (int r = 0; r < arr.length; r++) {
         for (int c = 0; c < arr.length; c++) {
            System.out.print(arr[r][c]);
         }
         System.out.println();
      }
   }

   // Searching a single value from the Array

   public void SearchingValue(int value) {
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr.length; j++) {
            if (arr[i][j] == value) {
               System.out.println("value is found at row: " + i + " col: " + j);
               return;
            }
         }
      }
      System.out.println("value is not found");
   }

   // Deleting a value from Array

   public void deleteValueFromArray(int r, int c) {
      try{
         System.out.println("Successfully deleted: "+arr[r][c]);
         arr[r][c]=Integer.MIN_VALUE;
      }
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("This index is not valid for array");
      }
   }
}