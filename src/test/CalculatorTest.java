package test;

import main.Calculator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.TestName;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	@Rule public TestName name = new TestName();
	
	@BeforeClass
	public static void starter(){
		System.out.println("Zaczynamy tetsy");
	}
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("wykonano test: "+name.getMethodName());
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@AfterClass
	public static void finnisher() {
		System.out.println("Koniec wszystkich testów");
	}
	
	@Test
	public void test1() throws Exception {
		System.out.println("Metoda testowa");
	}
	
	@Test
	public void testSum(){
		double z1=1.9;
		double z2=1.5;
		double wynik=classUnderTest.sum(z1, z2);
		
		Assert.assertEquals(3.4, wynik,0.00001);		
	}
	
	@Test
	public void testSubtract(){
		double z1=3.4;
		double z2=1.9;
		double wynik=classUnderTest.subtract(z1, z2);
		
		Assert.assertEquals(1.5, wynik,0.00001);
	}
	
	@Test
	public void testMultiply(){
		double z1=1.5;
		double z2=2.0;
		double wynik=classUnderTest.multiply(z1, z2);
		
		Assert.assertEquals(3.0, wynik,0.00001);
	}
	
	@Test
	public void testDivide(){
		double z1=3.6;
		double z2=3.0;
		double wynik=classUnderTest.divide(z1, z2);
		
		Assert.assertEquals(1.2, wynik,0.00001);
		
	}
	
	@Test(expected=Exception.class)
	public void testDivideByZero(){
		double z1=3.6;
		double z2=0.0;
		classUnderTest.divide(z1, z2);
	}
	

}
