package beginner065.b;

import java.util.BitSet;
import java.util.Scanner;


public class Main {
	
	private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        String line = sc.nextLine();

        
        int n = Integer.parseInt(line);
        
        int a[] = new int[n+1];
        
        for (int i = 1; i <= n; i++) {
        	line = sc.nextLine();
			a[i] = Integer.parseInt(line);
		}
        
        BitSet bits = new BitSet();
        
        int current = 1;	// Button 1 on
        bits.set(1);	// button 1 on
        int count = 0;

        while (true) {
        	count++;
        	int next = a[current];
        	
        	if (next == 2) {
        		System.out.println(count);
        		return;
        	}
        	
        	if (bits.get(next)) {
        		System.out.println(-1);
        		return;
        	} else {
        		bits.set(next);
        	}
        	
        	current = next;
        }
        
        
        
	}
	

	

}
