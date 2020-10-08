import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    private Pattern emailNamePtrn = Pattern.compile("^[\\w.+\\-]+@(gmail|pentalog)\\.com$");
         //   "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

    private Pattern phoneNumberPtrn = Pattern.compile("^\\([0-9]{3}\\)[0-9]{3}-[0-9]{4}$");

    public boolean validateEmailAddress(String userName){

        Matcher mtch = emailNamePtrn.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;
    }

    public boolean validatePhoneNumber(String phone){

        Matcher mtch = phoneNumberPtrn.matcher(phone);
        if(mtch.matches()){
            return true;
        }
        return false;
    }

    public boolean validatePostCode(String postcode){


        return false;
    }



}
