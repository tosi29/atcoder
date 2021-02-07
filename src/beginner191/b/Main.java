package beginner191.b;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        int n = sc.nextInt();
        int x = sc.nextInt();
//        int a[] = new int[n];
        boolean space_flag = false;
        
        for (int i = 0; i < n; i++) {
//			a[i] = sc.nextInt();
        	int a = sc.nextInt();
        	
            if (a != x) {
            	if (space_flag) {
            		System.out.print(" ");
            	}
            	System.out.print(a);
            	space_flag = true;
            }
		}
        
    }
}
