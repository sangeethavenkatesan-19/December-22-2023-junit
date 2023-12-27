package Phase2_JUNIT.Friday;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Age Calculator")
public class AgeCalculatorTest {
	
	AgeCalculator ageCalculator;
	
	@BeforeEach
	public void setUp() {
		ageCalculator = new AgeCalculator();
	}
	
	@AfterEach
	public void cleanUp() {
		if(ageCalculator != null)
			ageCalculator = null;
	}
	
	@Test
	@DisplayName("+ve year")
	public void test1() {
		int eResult = 33;
		int aResult = ageCalculator.calculateAge(1990);
		assertEquals(eResult,aResult);
		//assertEquals(28,ageCalculator.calculateAge(1990));
	}
	
	@Test
	@DisplayName("-ve year")
	public void test2() {
		assertEquals(0,ageCalculator.calculateAge(-1995));
	}
	
	@Test
	@DisplayName("0 year")
	public void test3() {
		assertEquals(0,ageCalculator.calculateAge(0));
	}
	
	@Test
	@DisplayName("+ve but larger year - future year ")
	public void test4() {
		assertEquals(-4,ageCalculator.calculateAge(2027));
	}
}
