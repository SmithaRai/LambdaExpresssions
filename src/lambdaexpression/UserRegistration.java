package lambdaexpression;
import java.util.regex.*;

public class UserRegistration {

	 private static final String PASSWORD_RULE1 = "^[a-zA-Z0-9_-]{8,}$";
	 private static final String PASSWORD_RULE2 = "^[a-zA-Z0-9_-]{8,}[A-Z]+$";
	 private static final String PASSWORD_RULE3 = "^[a-zA-Z0-9_-]{8,}[A-Z]+[0-9]+$";
	 private static final String PASSWORD_RULE4 = "^[a-zA-Z0-9_-]{8,}[A-Z]+[0-9]+[! @#&()]{1}$";
	 
	 public boolean validatepassword_rule1 (String pwd_rule1){
         
         Pattern pattern = Pattern.compile(PASSWORD_RULE1);
         return pattern.matcher(pwd_rule1).matches();
	  
             }
	 
      public boolean validatepassword_rule2 (String pwd_rule2){
         
         Pattern pattern = Pattern.compile(PASSWORD_RULE2);
         return pattern.matcher(pwd_rule2).matches();
	  
             }

      public boolean validatepassword_rule3 (String pwd_rule3){
    
         Pattern pattern = Pattern.compile(PASSWORD_RULE3);
         return pattern.matcher(pwd_rule3).matches();
 
        }

      public boolean validatepassword_rule4 (String pwd_rule4){
    
         Pattern pattern = Pattern.compile(PASSWORD_RULE4);
         return pattern.matcher(pwd_rule4).matches();
	 }              

}
