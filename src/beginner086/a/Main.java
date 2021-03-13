package beginner086.a;

import java.util.Scanner;

public class Main {
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);

        int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        // 出力
        System.out.println((a * b) % 2 == 0 ? "Even" : "Odd");
    }
}