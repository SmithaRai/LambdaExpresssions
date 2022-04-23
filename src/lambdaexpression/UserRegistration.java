package lambdaexpression;
import java.util.regex.*;

public class UserRegistration {

	 private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	  private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	  private static final String EMAIL_ID_PATTERN = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_-]+)*@[a-zA-Z0-9_-]+\\.[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_-]+)*$";
	  private static final String PHONE_NUMBER = "^[9][1]{0,1}\\s[0-9]{10}";
	  
	  public boolean validateFirstName (String fname){
	         
	            Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
	            return pattern.matcher(fname).matches();
		  
	                }
	      
	  public boolean validateLastName (String lname){
	      
	      Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
	      return pattern.matcher(lname).matches();

	  }
	      public boolean validateEmailId (String emailid){
	          
	          Pattern pattern = Pattern.compile(EMAIL_ID_PATTERN);
	          return pattern.matcher(emailid).matches();
	          }
	      
	      public boolean validatePhoneNumber (String pname){
	          
	          Pattern pattern = Pattern.compile(PHONE_NUMBER);
	          return pattern.matcher(pname).matches();

		                }
	

}
