public class Info {
      public static void main(String[] args) {
            int count = 1;
            int sum = 0;
            for (; count <= 6; count++) {
                  sum += count;
                  if (sum == 10) {
                        continue;
                  }
                  if (sum > count * 2) {
                        break;
                  }
            }
            do {
                  sum -= count;
            } while (sum > count);
            System.out.println(sum);

      }
}
