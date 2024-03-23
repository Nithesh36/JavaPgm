package Playing;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "helo";
        String s2 = "loeh";
        boolean anagram = false;
        if (s1.length() != s2.length())
            anagram = false;
        else
            for (int i = 0; i < s1.length(); i++) {
                if (s1.indexOf(s2.charAt(i)) >= 0) {
                    anagram = true;
                } else {
                    anagram = false;
                    break;
                }
            }

        if (anagram)
            System.out.println("anagram");
        else
            System.out.println("not a angram");
    }
}
