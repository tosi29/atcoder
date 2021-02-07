package beginner191.d;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        long x = Math.round(sc.nextDouble()*10000);
        long y = Math.round(sc.nextDouble()*10000);
        long r = Math.round(sc.nextDouble()*10000);
        
        long min_x = (x - r)/10000*10000 -10000;
        long max_x = (x + r)/10000*10000 + 10000;
//        int min_y = (int)(y - r);
//        int max_y = (int)(y + r +1);
        long count = 0;
        
        for (long i = min_x; i <= max_x; i+=10000) {
        	if ((r*r)-(i-x)*(i-x) < 0) {
        		continue;
        	}
//        	long y_len = Math.round(Math.floor(Math.sqrt((r*r)-(i-x)*(i-x))/10000))*10000;
        	long y_len = (long)Math.floor(Math.sqrt((r*r)-(i-x)*(i-x)));
        	long min_y = (long)(y - y_len);
        	long max_y = (long)(y + y_len);
        	
        	if (min_y % 10000 != 0) min_y+=10000;
/*        	
        	if ((min_y-y)*(min_y-y) + (i-x)*(i-x) > (r*r)) min_y+=10000;
        	if ((max_y-y)*(max_y-y) + (i-x)*(i-x) > (r*r)) max_y-=10000;
        	if ((min_y-y-10000)*(min_y-y-10000) + (i-x)*(i-x) <= (r*r)) min_y-=10000;
        	if ((max_y-y+10000)*(max_y-y+10000) + (i-x)*(i-x) <= (r*r)) max_y+=10000;
*/        	
//            System.out.println("x = " + i/10000 + "y = " + y + " min_y:" + min_y + "  max_Y:" + max_y + " "+ Math.sqrt((r*r)-(i-x)*(i-x))/10000);

        	min_y/=10000;
        	max_y/=10000;

            System.out.println("x = " + i/10000 + "y = " + y + " min_y:" + min_y + "  max_Y:" + max_y + " "+ Math.sqrt((r*r)-(i-x)*(i-x))/10000);
       		count+= (max_y-min_y) +1;
            System.out.println((max_y-min_y) +1);
		}
        System.out.print(count);
	}
}
