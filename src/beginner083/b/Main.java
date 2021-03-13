package beginner083.b;

import java.util.Scanner;

public class Main {
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int total = 0;
            total += i % 10;
            total += i / 10 % 10;
            total += i / 100 % 10;
            total += i / 1000 % 10;
            total += i / 10000;
            if (a <= total && total <= b) {
                count += i;
            }
        }

        // 出力
        System.out.println(count);
    }
}