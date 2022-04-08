package BinarySearch;

public class SmallestLetter {
   public static void main(String[] args) {

   }

   public char nextGreatestLetter(char[] letters, char target) {
      int l = 0, r = letters.length - 1;

      while (l <= r) {
         int m = l + (r - l) / 2;
         if (target < letters[m]) {
            r = m - 1;
         } else {
            l = m + 1;
         }
      }
      return letters[l % letters.length];
   }
}
