package beginner193.a;

import java.util.Scanner;


public class Main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int diff = (a - b) * 100;
        
        System.out.println(((double) diff) / a);
	}

}
