package lambdaexpression;
import java.util.regex.*;
import java.util.Scanner;

public class UserRegistration {

	  private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	  private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	  private static final String EMAIL_ID_PATTERN = "^[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,3}[,]?[.]?[a-z]?$";
	  private static final String PHONE_NUMBER = "^[9][1]{0,1}\\s[0-9]{10}";
	  private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}";
	 
	  
	  public boolean validateFirstName (String fname) throws CustomException {
	          
                  Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
                  boolean result = pattern.matcher(fname).matches();
                  if (result == false)
                  throw new CustomException("error");
                  else
                	  return result ;
	          }
  
          
    
     public boolean validateLastName (String lname) throws CustomException{
    
              Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
              boolean result = pattern.matcher(lname).matches();
              if (result == false)
               throw new CustomException("error");
                else
               return result ;
         }
      
      public boolean validateEmailId (String emailid)throws CustomException{
        
               Pattern pattern = Pattern.compile(EMAIL_ID_PATTERN);
               boolean result = pattern.matcher(emailid).matches();
               if (result == false)
                   throw new CustomException("error");
                    else
                   return result ;
        }
    
      public boolean validatePhoneNumber (String pnumber)throws CustomException{
          
                Pattern pattern = Pattern.compile(PHONE_NUMBER);
                boolean result = pattern.matcher(pnumber).matches();
                if (result == false)
                    throw new CustomException("error");
                     else
                    return result ;
        }
    
      public boolean validatepassword (String password)throws CustomException{
        
             Pattern pattern = Pattern.compile(PASSWORD);
             boolean result = pattern.matcher(password).matches();
             if (result == false)
                 throw new CustomException("error");
                  else
                 return result ;
            }
      
    	  Scanner in = new Scanner(System.in);
  
  		public String getfirstname() {
  		System.out.println("ENTER FIRST NAME : ");
		String fname = in.next();
		return fname ;
  		}
		
  		public String getlastname() {
		System.out.println("ENTER LAST NAME : ");
		String lname = in.next();
		return lname ;
  		}
		
		public String getEmailid() {
		System.out.println("ENTER EMAILID : ");
		String emailid = in.next();		
		return emailid ;
		}
		
		public String getPhonenumber() {
		System.out.println("ENTER MOBILE NUMBER : ");
		String pnumber = in.next();
		return pnumber ;
		}
		
		public String getPassword() {
		System.out.println("ENTER PASSWORD  : ");
		String password = in.next();
		return password ;
		}
		
	}
       
	 
	 	
