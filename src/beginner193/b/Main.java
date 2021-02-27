package beginner193.b;

import java.util.Scanner;


public class Main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
        
        int[] a = new int[n];
        int[] p = new int[n];
        int[] x = new int[n];
        
        for (int i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        	p[i] = sc.nextInt();
        	x[i] = sc.nextInt();
		}
        
        int best = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
			int price = buy(a[i], p[i], x[i]);
			if (price < best) {
				best = price;
			}
		}

        if (best != Integer.MAX_VALUE) {
        	System.out.println(best);
        } else {
        	System.out.println(-1);
        }
	}
	
	public static int buy(int a, int p, int x) {
		if (x - a > 0) {
			return p;
		} else {
			return Integer.MAX_VALUE;
		}
		
	}

}
