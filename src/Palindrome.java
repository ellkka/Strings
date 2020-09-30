public class Palindrome {
    private String word1;
    private String word2;

    public String getWord1() {
        return word1;
    }

    public void setWord1(String word1) {
        this.word1 = word1;
    }

    public String getWord2() {
        return word2;
    }

    public void setWord2(String word2) {
        this.word2 = word2;
    }

    public boolean isPalindrome(String word1, String word2){
        // Count frequencies of characters in
        // both given strings
        int[] countA = new int[26];
        int[] countB = new int[26];

        int l1 = word1.length();
        int l2 = word2.length();

        for (int i = 0; i < l1; i++)
            countA[word1.charAt(i) - 'a']++;

        for (int i = 0; i < l2; i++)
            countB[word2.charAt(i) - 'a']++;

        // Check if there is a character that
        // appears more than once in A and does
        // not appear in B
        for (int i = 0; i < 26; i++)
            if ((countA[i] > 1 && countB[i] == 0))
                return true;

        return false;
    }
}
