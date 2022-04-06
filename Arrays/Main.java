package Arrays;

public class Main {
   public static void main(String[] args) {
      // Q: store a roll num

      int a = 19;
      
      // Q:store a person's name
      String name = "shashwat pal";

      // Q: store 5 roll num

      int r1 = 23;
      int r2 = 55;
      int r3 = 18;

      //syntax
      //datatype[] variable_name=new datatype[size];
      //store 5 roll num
      //int[] rn=new int[5];
      //or directly
      //int[] rn2={23,12,45,32,15};

      int[] ros; //declaration of array.ros is getting defined in the stack
      ros = new int[5];//initialisation :actually here object is being created in the memory(heap)

      //System.out.println(ros[1]);

      String[] arr = new String[4];
      System.out.println(arr[0]);

      // for (String ele : arr) {
      //    System.out.println(ele);
      // }
   }
}
