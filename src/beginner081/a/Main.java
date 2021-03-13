package beginner081.a;

import java.util.Scanner;

public class Main {
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);

        int a = sc.nextInt();
        int count = 0;

        if (a >= 100) {
            count++;
        }
        if (a % 100 >= 10) {
            count++;
        }
        if (a % 10 >= 1) {
            count++;
        }

        // 出力
        System.out.println(count);
    }
}
