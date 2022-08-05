import java.util.Scanner;

public class Loopes {
    public static void main(String[] args) {
        // 1 вариант-----------------------
        int i = 0;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }

        // 2 вариант------------------------
        for (int i1 = 0; i1 <= 40; i1 += 2) {
            System.out.println(i1);
        }

        // 3 вариант------------------------
        Scanner in = new Scanner(System.in);
        int x = 0, n;
        n = in.nextInt();
        while (x <= n) {
            System.out.println(x);
            x += 2;
        }

       // task 4
        int[] array = new int[50];
        int k = 0;
        for (int s = 0; s < 100; s++)
            if (s % 2 == 1) {
                array[k] = s;
                k++;

            }
        for (int s = 0; s < k; s++) {
            System.out.println(array[s]);
        }
    }
}