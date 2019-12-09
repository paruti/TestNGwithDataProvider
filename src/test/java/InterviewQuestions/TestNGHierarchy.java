package InterviewQuestions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGHierarchy {
	
	@Test
	public void Test2() {
		  System.out.println("Test2");

	}
	
  @Test
  public void Test1() {
	  System.out.println("Test1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BFMethod");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AFMethod");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BFClass");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AFClass");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BFTest");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AFTest");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BFSuite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfSuite");

  }

}
