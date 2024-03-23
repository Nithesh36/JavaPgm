package Playing;
public class PalindromeSubString {
    public static void main(String[] args) {
        String input = "levelracecarhelloollehnoon"; // Change this string as per your requirement
        System.out.println("Palindromic Substrings in the given string:");
        findAllPalindromicSubstrings(input);
    }

    // Function to check if a substring is a palindrome
    public static boolean isPalindrome(String str) {
        boolean isPalindrome=true;
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {

               isPalindrome=false;
               break;
            }
            left++;
            right--;
        }
        return isPalindrome;
    }

    // Function to find all palindromic substrings in a string
    public static void findAllPalindromicSubstrings(String input) {
        int len = input.length();

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String substr = input.substring(i, j);
                if (isPalindrome(substr) && substr.length() > 1) {
                    System.out.println(substr  +"  str len:"+substr.length());
                }
            }
        }
    }
}
