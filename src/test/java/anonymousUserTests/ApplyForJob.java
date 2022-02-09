package anonymousUserTests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import loginUserTests.TestBase;
import pages.BE_ApplyForaJobPage;
import pages.P012_CareersPage;

public class ApplyForJob extends TestBase{
	
	P012_CareersPage careerspageobject;
	BE_ApplyForaJobPage applyforjobpageobject;
	
	Faker fakeDate= new Faker();
	String fname= fakeDate.name().firstName();
	String lname= fakeDate.name().lastName();
	String email= fakeDate.internet().emailAddress();
	String phone= fakeDate.number().digits(11);
	String currentsalary=fakeDate.number().digits(4);
	String expectedsalary=fakeDate.number().digits(4);

	@Test
	public void applyforajob() throws InterruptedException 
	{
		applyforjobpageobject= new BE_ApplyForaJobPage(driver);
		
		applyforjobpageobject.applytoajob(fname, lname, email, phone, currentsalary, expectedsalary);
	}

}
