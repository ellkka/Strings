public class Anagrams {
    private String word;
    private String anagram;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getAnagram() {
        return anagram;
    }

    public void setAnagram(String anagram) {
        this.anagram = anagram;
    }

    public boolean isAnagrams(String word, String anagram){

        if(word.length() != anagram.length()){
            return false;
        }

        char[] chars = word.toCharArray();

        for(char c : chars){
            int index = anagram.indexOf(c);
            if(index != -1) {
                anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
            }
            else{
                return false;
            }
        }
        return anagram.isEmpty();


    }

}
