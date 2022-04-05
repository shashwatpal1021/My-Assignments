package methods;

public class Overloading {
   public static void main(String[] args) {
      int ans = sum(3, 4, 78);
      System.out.println(ans);
      fun(67);
   }

   static int sum(int a, int b) {
      return a + b;
   }

   static int sum(int a, int b, int c) {
      return a + b + c;
   }

   static void fun(String name) {
      System.out.println("String");
      System.out.println(name);
   }

   static void fun(int a) {
      System.out.print("integer ");
      System.out.println(a);
   }

}
