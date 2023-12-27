package Phase2_JUNIT.Friday;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Retirement Calculator")
public class RetirementCalculatorTest {

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
		assertEquals(28,ageCalculator.calculateAge(1990));
	}
}
