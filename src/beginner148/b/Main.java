package beginner148.b;

import java.util.Scanner;

public class Main {

    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = sc.next();
        String t = sc.next();

        for (int i = 0; i < n; i++) {
            System.out.print(s.charAt(i));
            System.out.print(t.charAt(i));
        }

    }
}
