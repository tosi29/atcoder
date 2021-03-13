package beginner086.c;

import java.util.Scanner;

public class Main {
    private static Scanner sc;


	public static void main(String[] args) {
        sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] t = new int[n];
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int pre_t = 0;
        int pre_x = 0;
        int pre_y = 0;

        for (int i = 0; i < n; i++) {
            if (verify(t[i] - pre_t, pre_x, pre_y, x[i], y[i])) {
                pre_x = x[i];
                pre_y = y[i];
                pre_t = t[i];
            } else {
                System.out.println("No");
                System.exit(0);
            }
        }

        System.out.println("Yes");

    }


    private static boolean verify(int t, int from_x, int from_y, int to_x, int to_y) {
        int diff_x = to_x - from_x;
        int diff_y = to_y - from_y;

        if (diff_x < 0) {
            diff_x *= -1;
        }
        if (diff_y < 0) {
            diff_y *= -1;
        }

        // 移動距離がt以内 かつ 時間が潰せる
        if (diff_x + diff_y <= t && (t - diff_x - diff_y) % 2 == 0) {
            return true;
        }
        return false;
    }

}
