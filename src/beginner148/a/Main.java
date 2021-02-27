package beginner148.a;

import java.util.Scanner;

public class Main {
 
    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int b = sc.nextInt();
 
        int array[] = {1, 1, 1};
 
        array[a-1] = 0;
        array[b-1] = 0;
 
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                System.out.println(i+1);
            }
        }
    }
}