package test.java;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.Main;

@DisplayName("Main should")
class MainTests {
	static String[] str = new String[6];
	
	@BeforeAll
	static void setup()
	{
		System.out.println("Before All");
		str[0] = "asdf";
		str[1] = "ghjk";
		str[2] = "qwer";
		str[3] = "tyui";
		str[4] = "";
		str[5] = "";
	}
	@BeforeEach
	void init()
	{
		System.out.println("Before Each");		
	}
	
	@Test
	@DisplayName("Throw an exception")
	void exceptionTest()
	{
		assertThrows(NumberFormatException.class,() -> Integer.parseInt(str[4]));	

	}

	@Test
	@DisplayName("Check string joined properly1")
	void test1() {
		
		String expected = new String(str[0] + str[1]);
		String actual = Main.combiner(str[0], str[1]);
		assertNotNull(actual);
		assertEquals("Check your code..... ",expected, actual);
	}
	@Test
	@Disabled
	@DisplayName("Check string joined properly2")
	void test2() {
		
		String expected = new String(str[1] + str[2]);
		String actual = Main.combiner(str[1], str[2]);
		assertNotNull(actual);
		assertEquals("Check your code..... ",expected, actual);
		
	}
	
	@AfterEach
	void tearDown()
	{
		System.out.println("AfterEach");
	}
	
	@AfterAll
	static void tearDownAll()
	{
		System.out.println("After All");
	}
	

}

