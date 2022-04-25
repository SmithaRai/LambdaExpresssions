package lambdaexpression;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.regex.Pattern;
import org.junit.Assert;
import lambdaexpression.CustomException;
public class junittesting {
	
	
 
	@Test(expected = CustomException.class)
	  public void valid_firstname() throws CustomException {
			
		  UserRegistration obj = new UserRegistration ();
			boolean result = obj.validateFirstName(obj.getfirstname());
			Assert.assertEquals(true , result);
	      }
		  
	@Test(expected = CustomException.class)
		  public void valid_lastname() throws CustomException{	
			UserRegistration	obj = new UserRegistration();
			boolean result = obj.validateLastName(obj.getlastname());
			Assert.assertEquals(true , result);
				}
		

		@Test(expected = CustomException.class)
		public void valid_emailid() throws CustomException {
			
			UserRegistration obj = new UserRegistration();
			boolean result = obj.validateEmailId(obj.getEmailid());
			Assert.assertEquals(true , result);
			}
		
		@Test (expected = CustomException.class)
		public void valid_phonenumber() throws CustomException {
			
			UserRegistration obj = new UserRegistration();
			boolean result = obj.validatePhoneNumber(obj.getPhonenumber());
			Assert.assertEquals(true , result);
			}
		
		
		@Test (expected = CustomException.class)
		public void valid_password() throws CustomException {
			
			UserRegistration obj = new UserRegistration();
			boolean result = obj.validatepassword(obj.getPassword());
			Assert.assertEquals(true , result);
		}

}
	
