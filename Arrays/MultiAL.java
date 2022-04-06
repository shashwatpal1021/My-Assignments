package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      ArrayList<ArrayList<Integer>> list = new ArrayList<>();

      //initialisation

      for (int i = 0; i < 3; i++) {
         list.add(new ArrayList<>());
      }
      //add elements

      for (int j = 0; j < 3; j++) {
         for (int j2 = 0; j2 < 3; j2++) {
            list.get(j).add(s.nextInt());
         }
      }
      System.out.println(list);
   }
}
