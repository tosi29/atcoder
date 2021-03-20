package beginner196.b;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class Main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        String x = sc.nextLine();
        BigDecimal num = new BigDecimal(x).setScale(0, RoundingMode.FLOOR);
        
        System.out.println(num);
	}

}
