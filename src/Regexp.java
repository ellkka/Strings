import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Regexp {
    private static Pattern ptn =
            Pattern.compile("(MD-[0-9]{4,4}\\s)");

    public static int captureValues(String largeText){
        Matcher mtch = ptn.matcher(largeText);
        int count = 0;
        while(mtch.find()){
            count++;
            System.out.println(mtch);
        }
          return count;
    }

    public static void main(String a[]){
        String str = "Hi my machine IP is 10.20.30.40 and i would like "+
                "to access port 80 from MD-2345the host 23.12.56.34, which internally"+
                "connects to 3.90.23.65. MD-3977 Please process the request MD-2345.";
        System.out.println(captureValues(str));
    }

    }

