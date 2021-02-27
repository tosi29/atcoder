package beginner128.a;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		assertEquals(3, Main.calculate(1, 3));
		assertEquals(0, Main.calculate(0, 1));
		assertEquals(58, Main.calculate(32, 21));
	}

}
