package Recrusion;

public class Solution {
   public static void main(String[] args) {
      Solution main = new Solution();
      var p = main.power(2, 4);
      var f = main.factorial(5);
      int[] arr = { 1, 2, 3, 4, 5 };
      var P_Of_A = main.productOfArray(arr, 5);
      var RR = main.recursiveRange(5);
      var fib = main.fibonacci(10);

      var rev = main.reverse("shashwat");
      var Ispali = main.isPalindrome("shashwat");
      var fUppercase = main.first("shashWat");
      var cap = main.capitalizedWord("shashwat");

      System.out.println(p);
      System.out.println(f);
      System.out.println(P_Of_A);
      System.out.println(RR);
      System.out.println(fib);

      System.out.println(rev);
      System.out.println(Ispali);
      System.out.println(fUppercase);
      System.out.println(cap);
   }

   public int power(int base, int exp) {
      if (exp == 0) {
         return 1;
      }
      return base * power(base, exp - 1);
   }

   public int factorial(int n) {
      if (n <= 1) {
         return 1;
      }
      return n * factorial(n - 1);
   }

   public int productOfArray(int[] a, int n) {
      if (n <= 0) {
         return 1;
      }
      return productOfArray(a, n - 1) * a[n - 1];
   }

   public int recursiveRange(int n) {
      if (n <= 0) {
         return 1;
      }
      return n + recursiveRange(n - 1);
   }

   public int fibonacci(int n) {
      if (n <= 0) {
         return -1;
      }
      if (n == 0 || n == 1) {
         return n;
      }
      return fibonacci(n - 1) + fibonacci(n - 2);
   }

   public String reverse(String str) {
      if (str.isEmpty()) {
         return str;
      }
      return reverse(str.substring(1)) + str.charAt(0);
   }

   public boolean isPalindrome(String s) {
      if (s.length() == 0 || s.length() == 1) {
         return true;
      }
      if (s.charAt(0) == s.charAt(s.length() - 1)) {
         return isPalindrome(s.substring(1, s.length() - 1));
      }
      return false;
   }
   
   // public boolean someRecursive(int[] arr,oddFunction odd)

   public char first(String s) {
      for (int i = 0; i < s.length(); i++) {
         if (Character.isUpperCase(s.charAt(i)))
            return s.charAt(i);
      }
      return 0;
   }

   public static String capitalizedWord(String str) {
      String words[] = str.split("\\s");
      String capitalizedWord = "";
      for (String w : words) {
         String first = w.substring(0, 1);
         String afterfirst = w.substring(1);
         capitalizedWord += first.toUpperCase() + afterfirst + " ";
      }
      return capitalizedWord.trim();
   }
} 