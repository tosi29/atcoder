package beginner191.c;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine(); // skip
        
        String s[] = new String[h];
        
        for(int i = 0; i < h; i++) {
        	s[i] = sc.nextLine();
        }
        
        String result = core(h, w, s);
        
        System.out.print(result);
    }
	
	public static String core(int h, int w, String s[]) {
        int kaku = 0;
        
        for (int i = 0; i < h-1; i++) {
        	for (int j = 0; j < w-1; j++) {
                int count = 0;
        		if (s[i].charAt(j) == '#') {
        			count++;
        		}
        		if (s[i+1].charAt(j) == '#') {
        			count++;
        		}
        		if (s[i].charAt(j+1) == '#') {
        			count++;
        		}
        		if (s[i+1].charAt(j+1) == '#') {
        			count++;
        		}
        		
        		if (count == 1 || count == 3) {
        			kaku++;
        		}
			}
		}
        return ""+kaku;
	}
}
