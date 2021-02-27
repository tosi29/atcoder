package beginner128.b;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		ArrayList<Restaurant> test1 = new ArrayList<>();

		test1.add(new Restaurant(1, "khabarovsk", 20));
		test1.add(new Restaurant(2, "moscow", 10));
		test1.add(new Restaurant(3, "kazan", 50));
		test1.add(new Restaurant(4, "kazan", 35));
		test1.add(new Restaurant(5, "moscow", 60));
		test1.add(new Restaurant(6, "khabarovsk", 40));
		
		
		Main.calculate(test1);
		
		for (Restaurant restaurant : test1) {
			System.out.println(restaurant);
		}

		assertEquals(3, test1.get(0).id);
		assertEquals(4, test1.get(1).id);
		assertEquals(6, test1.get(2).id);
		assertEquals(1, test1.get(3).id);
		assertEquals(5, test1.get(4).id);
		assertEquals(2, test1.get(5).id);

	}

}
