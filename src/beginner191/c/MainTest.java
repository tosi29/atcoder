package beginner191.c;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testMain() {
		String s[] = new String[]{
				".....",
				".###.",
				".###.",
				".###.",
				"....."
		};
		String result = Main.core(5, 5, s);
		System.out.println(result);
	}

	@Test
	void testMain2() {
		String s[] = new String[]{
				".....",
				".###.",
				".###.",
				".###.",
				"....."
		};
		String result = Main.core(5, 5, s);
		System.out.println(result);
	}

}
