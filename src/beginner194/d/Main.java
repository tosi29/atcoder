package beginner194.d;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class Main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		BigDecimal bn = new BigDecimal(n).setScale(20);
		
		BigDecimal expect = BigDecimal.ZERO.setScale(20);
		for (int i = n; i >=1; i--) {
			expect = expect.add(bn.setScale(20).divide(new BigDecimal(i), RoundingMode.HALF_UP));
		}
		expect = expect.subtract(BigDecimal.ONE);
		
        System.out.println(expect.toString());
	}

}
