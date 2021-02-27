package beginner148.d;

import java.util.Scanner;

public class Main {

    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);

        int n = sc.nextInt();

        int break_count = 0;
        int next = 1;

        for (int i = 0; i < n ; i++) {
            if (sc.nextInt() == next) {
                next++;
            } else {
                break_count++;
            }
        }
        if (next == 1) {
            System.out.println(-1);
        } else {
            System.out.println(break_count);
        }
    }

}
