package beginner194.a;

import java.util.Scanner;


public class Main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a+b >= 15 && b >= 8) {
            System.out.println(1);
        } else if (a+b >= 10 && b >= 3) {
            System.out.println(2);
        } else if (a+b >= 3) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
        
	}

}
