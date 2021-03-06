package beginner194.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        int n = sc.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[n];
        
        for (int i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        	b[i] = sc.nextInt();
		}
        
        int best_a_idx = findMin(a);
        int best_b_idx = findMin(b);
        
        if (best_a_idx != best_b_idx) {
        	if (a[best_a_idx] > b[best_b_idx]) {
        		System.out.println(a[best_a_idx]);
        	} else {
        		System.out.println(b[best_b_idx]);
        	}
        } else {
        	int candidate[] = new int[3];
        	int better_a = a[findMin2nd(a)];
        	int better_b = b[findMin2nd(b)];
        	
        	candidate[0] = a[best_a_idx] + b[best_b_idx]; // Same Person
        	candidate[1] = better_a > b[best_b_idx] ? better_a : b[best_b_idx]; // Best b and Better a
        	candidate[2] = a[best_a_idx] > better_b ? a[best_a_idx] : better_b; // Best a and Better b
        	
        	Arrays.sort(candidate);
        	System.out.print(candidate[0]);
        }
	}
	
	private static int findMin(int[] data) {
		int min = data[0];
		int idx = 0;
		for (int i = 1; i < data.length; i++) {
			if (min > data[i]) {
				min = data[i];
				idx = i;
			}
		}
		return idx;
	}
	
	private static int findMin2nd(int[] data) {
		int min = data[0];
		int idx = 0;
		int idx2nd = 0;
		for (int i = 1; i < data.length; i++) {
			if (min > data[i]) {
				idx2nd = idx;
				min = data[i];
				idx = i;
			}
		}
		return idx2nd;
	}
	
}
