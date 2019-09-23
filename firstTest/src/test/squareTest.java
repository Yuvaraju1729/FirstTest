package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		FirstTest ft=new FirstTest();
		int output=ft.square(5);
		assertEquals(25,output);
	}

}
