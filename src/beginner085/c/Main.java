package beginner085.c;

import java.util.Scanner;

public class Main {
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);

        int n = sc.nextInt();
        int y = sc.nextInt()/1000;

        for(int i=0; i<=n; i++) {
        	int j = y - n - 9*i;
        	if (j<0 || j%4 != 0) {
        		continue;
        	}
        	j /= 4;
    		int k = n-i-j;
    		if (k>=0 && 10*i + 5*j + k == y) {
    	        System.out.println(i + " " + j + " " + k);
    	        System.exit(0);
    		}
        }

        System.out.println("-1 -1 -1");
    }
}
