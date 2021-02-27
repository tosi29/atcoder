package beginner193.d;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class Main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int k = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		int[] s_cards = new int[10];
		int[] t_cards = new int[10];
		
		long[] remain = new long[10];
		
		for (int i = 0; i <= 3; i++) {
			s_cards[s.charAt(i) - '0']++;
			t_cards[t.charAt(i) - '0']++;
		}
		
		for (int i = 1; i <= 9; i++) {
			remain[i] = k - s_cards[i] - t_cards[i];
		}
		
		long s_wins = 0;
		long patterns = 0;
		
		// Simulation 9x9
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				s_cards[i]++;
				t_cards[j]++;
				
				if (i == j && remain[i] >= 2) {
					patterns += remain[i] * (remain[i]-1);
					if (calculate(s_cards) - calculate(t_cards) > 0) {
						s_wins += remain[i] * (remain[i]-1);
					}
				} else if (i != j && remain[i] >= 1 && remain[j] >= 1) {
					patterns += remain[i] * (remain[j]);
					if (calculate(s_cards) - calculate(t_cards) > 0) {
						s_wins += remain[i] * (remain[j]);
					}
				}
				
				s_cards[i]--;
				t_cards[j]--;
			}
		}
		
		BigDecimal answer = new BigDecimal(s_wins).setScale(20).divide(new BigDecimal(patterns), RoundingMode.HALF_UP);
		
		System.out.println(answer.toString());
//		System.out.println((double)s_wins / patterns);
	}
	
	public static int calculate(int[] cards) {
		int score = 0;
		
		for (int i = 1; i <= 9; i++) {
			int sub_score = i;
			for (int j = 0; j < cards[i]; j++) {
				sub_score *= 10;
			}
			score += sub_score;
		}
		return score;
	}

}
