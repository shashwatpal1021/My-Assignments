package Arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListEx {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      ArrayList<Integer> list = new ArrayList<>(5);

      // list.add(67);
      // list.add(234);
      // list.add(654);
      // list.add(43);
      // list.add(654);
      // list.add(8765);

      // System.out.println(list.contains(765432));
      // System.out.println(list);
      // list.set(0, 99);
      // list.remove(2);
      // System.out.println(list);

      //input

      for (int i = 0; i < 5; i++) {
         list.add(s.nextInt());
      }

      //get item at any index

      for (int i = 0; i < 5; i++) {
         System.out.println(list.get(i));
      }
      System.out.println(list);
   }
}
