import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] split = line.split(" ");
        
        int x = Integer.parseInt(split[0]);
        int a = Integer.parseInt(split[1]);
        int b = Integer.parseInt(split[2]);
        
        if (a >= b) {
        	System.out.println("delicious");
        } else if (x >= (b-a)) {
        	System.out.println("safe");
        } else {
        	System.out.println("dangerous");
        }
        
	}

}
