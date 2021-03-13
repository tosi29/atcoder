package beginner049.c;


import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        String[] candidates = {"dream", "dreamer", "erase", "eraser"};
        
        int last = line.length();
        
        while (true) {
        	boolean changes = false;
        	if (last == 0) {
        		System.out.print("YES");
        		break;
        	}
        	
        	for (String candidate : candidates) {
				if (line.regionMatches(last-candidate.length(), candidate, 0, candidate.length())) {
					last -= candidate.length();
					changes = true;
					break;
				}
			}
        	if (changes == false) {
	    		System.out.print("NO");
	        	break;
        	}
        }
        
	}

}
