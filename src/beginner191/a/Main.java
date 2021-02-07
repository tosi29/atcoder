package beginner191.a;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        int v = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        
        int makyu_start = v*t;
        int makyu_end = v*s;
        
        if (d < makyu_start || makyu_end < d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}
