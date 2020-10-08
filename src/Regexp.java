import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Regexp {
    private static Pattern ptn =
            Pattern.compile("(MD-[0-9]{4,4})");

    public static int captureValues(String largeText){
        Matcher mtch = ptn.matcher(largeText);
        int count = 0;
        while(mtch.find()){
            count++;
            System.out.println(mtch);
        }
          return count;
    }



    }

