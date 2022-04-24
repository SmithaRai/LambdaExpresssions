package lambdaexpression;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;

import java.util.Scanner;
import java.util.regex.Pattern;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class junittesting {
  
	private String emailid ;
	private Boolean expectedResult;
	
	UserRegistration obj;
	
	@Before
	public void setup()
	{
		 obj = new UserRegistration();	
	}
	
	public  junittesting(Boolean expectedResult , String emailid ) {
	     this.emailid = emailid ;
	     this.expectedResult = expectedResult;
	    }
	
	
	  @Parameterized.Parameters
	   public static Collection <Object[]> Emailid_samples() {
	      Object[][] data = new Object[][]{
	         { true,"abc@yahoo.com," },
	         { true,"abc-100@yahoo.com," },
	         { true,"abc.100@yahoo.com"},
	         { true,"abc111@abc.com,"},
	         { true,"abc-100@abc.net,"},
	         { true,"abc.100@abc.com.au"},
	         { true,"abc@1.com,"},
	         { true,"abc@gmail.com.com"},
	         { true,"abc+100@gmail.com"}     
	      };
	      return Arrays.asList(data);
	}


	@Test
	public void test_emailid_samples() {
		
		//UserRegistration obj = new UserRegistration();
		System.out.println("");
		boolean result = obj.validate_emailid_samples(emailid);
		Assert.assertEquals( expectedResult, result);
	
	}
}