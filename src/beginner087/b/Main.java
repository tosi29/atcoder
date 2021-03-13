package beginner087.b;

import java.util.Scanner;

public class Main {
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();

        boolean map[][][] = new boolean[a + 1][b + 1][c + 1];

        int total = 0;

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= c; k++) {
                    if (map[i][j][k] == false) {
                        if ((500 * i + 100 * j + 50 * k) == x) {
                            total++;
                            map[i][j][k] = true;
                        }
                    }
                }
            }
        }

        // 出力
        System.out.println(total);
    }
}