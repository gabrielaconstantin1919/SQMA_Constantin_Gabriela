import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class LifeTestCase1 {

private static Life life;
	
	@BeforeClass
	public static void stare() {
		life = new Life();
	}
	
	@Test(expected = Error.class)
	public void testLifeHobbyFail() {
		life.setMainHobby("sa");
	}
	
	@Test
	public void testLifeHobbyCorrect() {
		life.setMainHobby("salsa");
		assertEquals(life.getMainHobby(), "salsa");
	}
	
	@Test
	public void testLifeWorkingHoursPerDay() {
		life.setWorkingHoursPerDay(8);
		boolean isBalanced = life.getBalance();
		boolean expectedResponse = true;
		assertEquals(expectedResponse, isBalanced);
	}

}
