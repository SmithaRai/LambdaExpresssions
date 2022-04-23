package lambdaexpression;
import java.util.regex.*;

public class UserRegistration {

	 private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	  private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	  private static final String EMAIL_ID_PATTERN = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_-]+)*@[a-zA-Z0-9_-]+\\.[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_-]+)*$";
	  
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
	

}
