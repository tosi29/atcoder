package beginner096.c;

import java.util.Scanner;

public class Main {
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();

        char s[][] = new char[h+2][w+2];
        for (int i = 1; i <= h; i++) {
            String line = sc.nextLine();
            for (int j = 1; j <= w; j++) {
                s[i][j] = line.charAt(j-1);
            }
        }

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (s[i][j] == '#') {
                    if (s[i][j-1] == '#') continue;
                    if (s[i-1][j] == '#') continue;
                    if (s[i+1][j] == '#') continue;
                    if (s[i][j+1] == '#') continue;
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}