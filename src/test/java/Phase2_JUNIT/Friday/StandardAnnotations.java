package Phase2_JUNIT.Friday;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(" This is the Standard Annotation for JUnit ")
public class StandardAnnotations {
	
	//JUnit Fixtures
	@BeforeEach
	public void setUp() {
		System.out.println("--------Before Each--------");
	}
	
	@AfterEach
	public void cleanUp() {
		System.out.println("--------After Each--------");
	}
	
	@BeforeAll
	public static void setUpAll() {
		System.out.println("$$$$---Before All test is executed---$$$$");
	}
	
	@AfterAll
	public static void cleanUpAll() {
		System.out.println("$$$$---After All test is executed---$$$$");
	}
	
	@Test
	@DisplayName(" Test 1 ")
	public void test1() {
		System.out.println("Test One is Executed");
	}
	
	@Test
	@DisplayName(" Test 2 ")
	public void test2() {
		System.out.println("Test two is executed");
	}
	
	@Test
	@DisplayName(" Test 3 ")
	public void test3() {
		System.out.println("Test three is executed");
	}
	
}
