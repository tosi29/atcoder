package beginner085.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] mochi = new int[n];
        for (int i = 0; i < n; i++) {
            mochi[i] = sc.nextInt();
        }

        System.out.println(Arrays.stream(mochi).distinct().count());
    }
}