package beginner065.c;

import java.util.Scanner;


public class Main {
	
	private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] split = line.split(" ");
        
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        
        
        
        if (n == m) {
        	System.out.println(factorial(n)*factorial(m)*2%1000000007);
        } else if (n+1 == m || n-1 ==m) {
        	System.out.println(factorial(n)*factorial(m)%1000000007);
        } else {
        	System.out.println(0);
        }

        
	}
	
	public static long factorial(int n) {
		long ans = 1;
		for (long i = 2; i <= n; i++) {
			ans *= i;
			ans %= 1000000007;
		}
		return ans;
	}

	

}
