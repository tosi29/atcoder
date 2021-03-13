package beginner081.b;

import java.util.Scanner;

public class Main {
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] input = new int[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        while (true) {
            for (int i = 0; i < n; i++) {
                if (input[i] % 2 == 0) {
                    input[i] /= 2;
                } else {
                    System.out.println(count);
                    System.exit(0);
                }
            }
            count++;
        }
    }
}