package Phase2_JUNIT.Friday;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

@DisplayName(" java 8 for JUnit functionality testing")
public class Java8UnitTest {

	@Test
	@DisplayName(" sum of numbers with java 8 lambda expressions ")
	public void lambdaExpressionTest() {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		int eResult = 45;
		int aResult = numbers.stream().mapToInt(Integer::intValue).sum();
		assertEquals(eResult, aResult);
	}
	
	@Test
	@DisplayName("Sum of numbers should be greater than 5")
	public void lambdaExpressionTest2() {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		int eResult = 5;
		assertTrue(numbers.stream().mapToInt(Integer:: intValue).sum() > eResult);
		assertTrue(numbers.stream().mapToInt(Integer:: intValue).sum() > eResult , ()-> "Sum should be greater than 5");
	}
	
	@Test
	@DisplayName("Group Assertions")
	public void lambdaExpressionTest3() {
		int[] numbers = {0, 1, 20, 3, 40};
		assertAll("Numbers" , ()-> assertEquals(numbers[0], 0));
		assertAll("Numbers" , ()-> assertEquals(numbers[2], 20));
		assertAll("Numbers" , ()-> assertEquals(numbers[2], 20) , ()-> assertEquals(numbers[4], 40));
		assertAll("Numbers" , 
				()-> assertEquals(numbers[2], 20), 
				()-> assertEquals(numbers[4], 40),
				()-> assertEquals(numbers[3], 3)
				);
	}
}
