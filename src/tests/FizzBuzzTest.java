package tests;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	private code.FizzBuzz fz;
	private Random rand;
	
	@Test
	void testFizz() {
fz = new code.FizzBuzz();
rand = new Random();

for (int i=0; i< rand.nextInt(100);i++) {
	
	boolean fizz = i%3==0;
	
	assertTrue(fizz==fz.isFizz(i));
}


	}
	
	@Test
	void testBuzz() {
fz = new code.FizzBuzz();
rand = new Random();

for (int i=0; i< rand.nextInt(100);i++) {
	
	boolean buzz = i%5==0;
	
	assertTrue(buzz==fz.isFizz(i));
}


	}
	
	@Test
	void testFizzBuzz() {
fz = new code.FizzBuzz();
rand = new Random();

for (int i=0; i< rand.nextInt(100);i++) {
	
	boolean fizz = (i%3==0)&&(i%5==0);
	
	assertTrue(fizz==fz.isFizzBuzz(i));
}


	}

}
