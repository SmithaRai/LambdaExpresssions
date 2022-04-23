package lambdaexpression;

import org.junit.Test;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.junit.Assert;

public class junittesting {

	//HAPPY TEST CASES
    @Test
	  public void valid_firstname_returntrue() {
			
    	UserRegistration obj = new UserRegistration ();
			boolean result = obj.validateFirstName("Smitha");
			Assert.assertEquals(true , result);
			
		}
		
		@Test
		public void valid_lastname_returntrue() {
			
			UserRegistration	obj = new UserRegistration();
			boolean result = obj.validateLastName("Smitha");
			Assert.assertEquals(true , result);
		}

		@Test
		public void valid_emailid_returntrue() {
			
			UserRegistration obj = new UserRegistration();
			boolean result = obj.validateEmailId("smitha@gmail.com");
			Assert.assertEquals(true , result);
		
		}
		
		@Test
		public void valid_phonenumber_returntrue() {
			
			UserRegistration obj = new UserRegistration();
			boolean result = obj.validatePhoneNumber("91 2341736897");
			Assert.assertEquals(true , result);
		}
		
		public void valid_password_returntrue() {
			
			UserRegistration obj = new UserRegistration();
			boolean result = obj.validatepassword("Smitha@1");
			Assert.assertEquals(true , result);
		}
	
		//SAD TEST CASES
		
		@Test
		  public void valid_firstname_returnfalse() {
				
			UserRegistration obj = new UserRegistration ();
				boolean result = obj.validateFirstName("Smitha ");
				Assert.assertEquals(true , result);
				
			}
			
			@Test
			public void valid_lastname_returnfalse() {
				
				UserRegistration obj = new UserRegistration();
				boolean result = obj.validateLastName("rai");
				Assert.assertEquals(true , result);
			}

			@Test
			public void valid_emailid_returnfalse() {
				
				UserRegistration obj = new UserRegistration();
				boolean result = obj.validateEmailId("smitha.@gmail.com");
				Assert.assertEquals(true , result);
			
			}
			
			@Test
			public void valid_phonenumber_returnfalse() {
				
				UserRegistration obj = new UserRegistration();
				boolean result = obj.validatePhoneNumber("91 42341736897");
				Assert.assertEquals(true , result);
			}

			@Test
             public void valid_password_returnfalse() {
				
				UserRegistration obj = new UserRegistration();
				boolean result = obj.validatepassword("sA!@7");
				Assert.assertEquals(true , result);
			}
		
	}


