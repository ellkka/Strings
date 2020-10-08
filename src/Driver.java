import java.util.Scanner;

public class Driver {

    public static void main(String args[]) {
//        String a = "tata";
//        String b = "atta";
//        Palindrome p = new Palindrome();
//        Anagrams anagram = new Anagrams();
//
//        System.out.println("Are the strings anagrams? " + anagram.isAnagrams(a,b));
//
//        //System.out.println(p.isPalindrome(a, b));
//
//        String str = "Hi my machine IP is 10.20.30.40 and i would like "+
//                "to access port 80 from MD-2345the host 23.12.56.34, which internally"+
//                "connects to 3.90.23.65. MD-3977 Please process the request MD-2345.";
//        System.out.println("Number of MD post codes: " + Regexp.captureValues(str));

        Scanner input = new Scanner(System.in);
        Validator validate = new Validator();
       int option;

        do {
            System.out.println("What to validate: \n 1. Email\n 2.PostCode\n 3. Phone number\n 4. Exit");
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter email: ");
                    String email = input.next();
                    System.out.println(validate.validateEmailAddress(email));
                    break;
                case 2:
                    System.out.println("2: ");
                    break;
                case 3:
                    System.out.println("3: ");
                    break;
                case 4:
                    break;

            }
        } while (option != 4);
    }


    }

