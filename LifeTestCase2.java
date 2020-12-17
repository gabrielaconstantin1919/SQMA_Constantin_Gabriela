import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class LifeTestCase2 {

private static Life life;
	
	@BeforeClass
	public static void stare() {
		life = new Life();
	}
	
	@Test
	public void testLifeBalance() {
		life.isBalanced(false);
		boolean actualResponse = life.getBalance();
		boolean expectedResponse = false;
		assertEquals(expectedResponse, actualResponse);
	}
	
	@Test
	public void testLifeNrOfCoffiesPerDay() {
		life.setNrOfCoffieesPerDay(2);
		int actualResponse = life.getNrOfCoffieesPerDay();
		int expectedResponse = 2;
		assertEquals(expectedResponse, actualResponse);
	}

}
