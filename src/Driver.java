public class Driver {

    public static void main(String args[])
    {
        String a = "tata";
        String b = "atta";
        Palindrome p = new Palindrome();
        Anagrams anagram = new Anagrams();

        System.out.println(anagram.isAnagrams(a,b));

        //System.out.println(p.isPalindrome(a, b));
    }
}
