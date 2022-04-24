package lambdaexpression;
import java.util.regex.*;
import java.util.Scanner;

public class UserRegistration {

	private static final String EMAIID_SAMPLES = "^[a-zA-Z0-9-.+]+([@])[a-zA-Z0-9]+[.][a-z]{3,}[.,]?([a-z]{2,})?$";
	
	 public boolean validate_emailid_samples (String email_samples){
 	    
 	    Pattern pattern = Pattern.compile(EMAIID_SAMPLES);
 	    return pattern.matcher(email_samples).matches();
       }
	 
	 	
}