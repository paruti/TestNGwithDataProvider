package InterviewQuestions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StatMethods {
	
	@BeforeClass
	public void bfClass() {
System.out.println("BF Class");
	}
	
	@BeforeMethod
	public void bfMethod() {
System.out.println("BF Method");
	}
	
	@AfterMethod
	public void afMethod() {
System.out.println("AF Method");
	}
	
	@Test
	public  void test1() {
		System.out.println("Test1");
	}

	@Test
	public static void test2() {
		System.out.println("Test2");
	}

	@AfterClass
	public void afClass() {
		System.out.println("AF Class");
	}
}
