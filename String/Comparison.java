package String;

public class Comparison {
   public static void main(String[] args) {
      String a = "shashwat";
      String b = "shashwat";
      String c = a;

      System.out.println(c == a);
      
      System.out.println(a == b);
      String n1 = new String("shashwat");
      String n2 = new String("shashwat");

      System.out.println(n1 == n2);
      System.out.println(n1.equals(n2));
   }
}
